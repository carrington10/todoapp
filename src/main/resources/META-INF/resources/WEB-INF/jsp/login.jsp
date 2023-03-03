<html>
	<head>
		<title> Login Page</title>
		<link rel="stylesheet" href=
        "https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
          
            <script src=
        "https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
            </script>
	</head>
	<body>
		<div class="container">
			<h1>Login</h1>
			<div class="form-group">
				<pre>${errorMessage}</pre>
				
				<form method="post"> Name: <input type="text" name="name" >
					Password: <input type="text" name="password">
				<input type="submit" class="btn btn-primary">
				</form>
			</div>
		</div>
	</body>
</html>