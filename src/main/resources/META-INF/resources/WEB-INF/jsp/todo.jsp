<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title> Add Todos Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
       
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	</head>
	<body>
		<div class="container">
         	<h1>Enter Todo Details</h1>
            <form:form method="post" modelAttribute="todo">Description:<form:input type="text" path="description" required="required"/>
		    <form:input type="hidden" path="id"/>
		    <form:input type="hidden" path="done"/>
			<input type="submit" class="btn btn-success">
		    </form:form>
            
        </div>
	</body>
</html>