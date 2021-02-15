<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
    <h1>Add TaxPayer Information</h1>
        
    <form:form modelAttribute="formTaxpayer">
        <form:errors path="" element="div" />
   
        <div>
            <form:label path="name">Name</form:label>
            <form:input path="name" />
            <form:errors path="name" />
        </div>
           <div>
            <form:label path="category">Category</form:label>
            <form:input path="category" />
            <form:errors path="category" />
        </div>
        <div>
            <input type="submit" />
        </div>
    </form:form>
</body>
</html>