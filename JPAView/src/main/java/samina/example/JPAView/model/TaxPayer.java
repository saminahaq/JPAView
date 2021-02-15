package samina.example.JPAView.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TaxPayer {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	private String category;
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", category=" +category + "]";
	}

}
	
