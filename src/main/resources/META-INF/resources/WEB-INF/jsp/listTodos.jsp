<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title> List Todos Page</title>
        <link rel="stylesheet" href=
        "https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
          
            <script src=
        "https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
            </script>
	</head>
	<body>
		<div class="container">
         <h1>Your Todos </h1>
            <table class="table">
                <thead> 
                    <tr>
                    <th>Id</th>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>Done?</th>
                    </tr>
                </thead>
                <tbody>
            <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
            </tr>
            </c:forEach>
            </tbody>
            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"> </script>
            <script src="webjars/jquery/3.6.0/jquery.min.js"> </script>
            </table>
            <a href="add-todo"  class="btn btn-success"> Add Todo</a> 
        </div>
        
	</body>
</html>