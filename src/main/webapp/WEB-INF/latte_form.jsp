<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">		
	</head>
	<body style="padding: 20px">
		<div>
			<h2>使用者資料表單</h2>
			<form class="pure-form" method="POST" action"/JavaWeb/latte">
				<fieldset>
					<legend>User Form</legend>
					<label>請輸入牛奶毫升數(ml):</label>
					<input name="milk" type="number" min="0.1" max="1000" step="0.1" required />
					<p />
					<label>請輸入咖啡毫升數(ml):</label>
					<input name="coffee" type="number" min="0.1" max="1000" step="0.1" required />
					<p />
					<button type="submit" class="pure-button pure-button-primary">送出</button>
					
				</fieldset>
			
			</form>
		</div>
	</body>
</html>