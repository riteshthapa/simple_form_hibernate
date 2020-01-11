<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body BGCOLOR="#FDF5E6">
	
	<br/><br/>
	
	<form action="register" method="post">
		
		Item Number:
		<input type='text' name='itemNumber'><br/>
		Price Each:
		<input type='text' name='price' value='$'><br/>
		<hr> 
		First Name:
		<input type='text' name='firstName'><br/>
		
		Last Name:
		<input type='text' name='lastName'><br/>
		Shipping Address:
		<textarea cols="50" rows="5" style="overflow:scroll;" name="address"></textarea><br/>
		
		Credit Card:<br />
		<input type="radio" name="method" value="visa"> Visa <br/>
		<input type="radio" name="method" value="masterCard"> MasterCard <br/>
		
		Credit Card Number:
		<input type='text' name='cardNumber'><br/><br/>
		
		&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
		<input type="submit" value="Submit Order" />
	</form>
</body>
</html>