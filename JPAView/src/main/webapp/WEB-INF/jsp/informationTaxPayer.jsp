
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h1>TaxPayer Information</h1>

<ul>
	<c:forEach items="${taxpayer}" var="taxpayer">
		<div>
			<table border="1">
				<tr>
					<th>Id </th>
					<th>category</th>
					<th>Name</th>
				</tr>
				<tr>
					<td>${taxpayer.id}</td> 
					<td>${taxpayer.category}</td>
					<td>${taxpayer.name}</td> 
				</tr>
	</c:forEach>
	</table>
	</div>
</ul>

