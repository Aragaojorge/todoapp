<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Add Todo</title>
		<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<h1>Enter Todo Details</h1>
			<form method="post">
				Description: <input type="text" name="description" />
				<input type="submit" class="btn btn-success" />
		</div>
		<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.4/js/jquery.min.js"></script>
	</body>
</html>