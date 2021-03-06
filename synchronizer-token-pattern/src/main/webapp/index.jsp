<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	background: #e9e9e9;
	color: #666666;
	font-family: 'RobotoDraft', 'Roboto', sans-serif;
	font-size: 14px;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
}

/* Pen Title */
.pen-title {
	padding: 200px 0;
	text-align: center;
	letter-spacing: 2px;
}

/* Form Module */
.form-module {
	position: relative;
	background: #ffffff;
	max-width: 320px;
	width: 100%;
	border-top: 5px solid #33b5e5;
	box-shadow: 0 0 3px rgba(0, 0, 0, 0.1);
	margin: 0 auto;
}

.form-module .toggle {
	cursor: pointer;
	position: absolute;
	top: -0;
	right: -0;
	background: #33b5e5;
	width: 30px;
	height: 30px;
	margin: -5px 0 0;
	color: #ffffff;
	font-size: 12px;
	line-height: 30px;
	text-align: center;
}

.form-module .toggle .tooltip {
	position: absolute;
	top: 5px;
	right: -65px;
	display: block;
	background: rgba(0, 0, 0, 0.6);
	width: auto;
	padding: 5px;
	font-size: 10px;
	line-height: 1;
	text-transform: uppercase;
}

.form-module .toggle .tooltip:before {
	content: '';
	position: absolute;
	top: 5px;
	left: -5px;
	display: block;
	border-top: 5px solid transparent;
	border-bottom: 5px solid transparent;
	border-right: 5px solid rgba(0, 0, 0, 0.6);
}

.form-module .form {
	display: none;
	padding: 40px;
}

.form-module .form:nth-child(2) {
	display: block;
}

.form-module h2 {
	margin: 0 0 20px;
	color: #33b5e5;
	font-size: 18px;
	font-weight: 400;
	line-height: 1;
}

.form-module input {
	outline: none;
	display: block;
	width: 100%;
	border: 1px solid #d9d9d9;
	margin: 0 0 20px;
	padding: 10px 15px;
	box-sizing: border-box;
	font-wieght: 400;
}

.form-module input:focus {
	border: 1px solid #33b5e5;
	color: #333333;
}

.form-module button {
	cursor: pointer;
	background: #33b5e5;
	width: 100%;
	border: 0;
	padding: 10px 15px;
	color: #ffffff;
}

.form-module button:hover {
	background: #178ab4;
}

.form-module .cta {
	background: #f2f2f2;
	width: 100%;
	padding: 15px 40px;
	box-sizing: border-box;
	color: #666666;
	font-size: 12px;
	text-align: center;
}

.form-module .cta a {
	color: #333333;
	text-decoration: none;
}

.align {
	text-align: center;
}
</style>
</head>
<body>

	<div class="pen-title">
		<div class="module form-module">
			<div class="toggle"></div>
			<div class="form">
				<h2 class="align">Login to your account</h2>
				<form action="login" method="POST">
					<input type="text" placeholder="Username" name="username"/>
					<input type="password" placeholder="Password" name="password"/>
					<input type="submit" value="Login" />
				</form>
			</div>
		</div>
	</div>

</body>
</html>
