package samina.example.JPAView.controllers;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import samina.example.JPAView.data.EmployeeRepository;
import samina.example.JPAView.data.TaxPayerRepository;
import samina.example.JPAView.model.Employee;
import samina.example.JPAView.model.TaxPayer;
@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeData;
	@Autowired
	private TaxPayerRepository taxPayerData;

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.POST)
	public String newEmployee(Employee employee) {

		logger.info("here Post");
		employeeData.save(employee);
		return ("redirect:/listEmployees.html");

	}
	
	@RequestMapping(value = "/addTaxPayer.html", method = RequestMethod.GET)
	public ModelAndView addNewTaxPayer() {

		
		TaxPayer txpayer = new TaxPayer();
		logger.info("here Get tax payer");
		return new ModelAndView("addTaxPayer", "formTaxpayer", txpayer);
		

	}
	@RequestMapping(value = "/addTaxPayer.html", method = RequestMethod.POST)
	public String newAddTaxPayer(TaxPayer taxpayer) {

//		logger.info("here Post");
		taxPayerData.save(taxpayer);
		return ("redirect:/TaxPayerInformation.html");

	}


	@RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.GET)
	public ModelAndView addNewEmployee() {

		logger.info("here Get");
		Employee emp = new Employee();
		return new ModelAndView("newEmployee", "form", emp);

	}

	@RequestMapping(value = "/listEmployees.html", method = RequestMethod.GET)
	public ModelAndView employees() {
		List<Employee> employee = employeeData.findAll();
	
		return new ModelAndView("allEmployees", "employee", employee);
		  
		
	}
	
	@RequestMapping(value = "/TaxPayerInformation.html", method = RequestMethod.GET)
	public ModelAndView taxPayers() {
		List<TaxPayer> taxpayer = taxPayerData.findAll();
		
		return new ModelAndView("informationTaxPayer", "taxpayer", taxpayer);
		  
		
	}
	@RequestMapping(value = "/clear.html", method = RequestMethod.GET)
	public String clearEmployee() {

		employeeData.deleteAll();
		return ("redirect:/listEmployees.html");

	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public String deleteStudent(@PathVariable long id) {
		employeeData.deleteById(id);
		return ("redirect:/listEmployees.html");
	}

	

}
