<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Student Form</title>
</head>
<body>
	<h3>
		Form Sinh Viên
		</h1>
		<div class="error">${message}</div>
		<form:form action="/student/save" modelAttribute="sv" method="post"
			enctype="multipart/form-data">
			Name: <form:input path="name"></form:input>
			<form:errors path="name" cssClass="error"></form:errors>
			<br>
			Email: <form:input path="email"></form:input>
			<form:errors path="email" cssClass="error"></form:errors>
			<br>
			Mark: <form:input path="marks"></form:input>
			<form:errors path="marks" cssClass="error"></form:errors>
			<br>
			Gender: <form:radiobuttons path="gender" items="${genders}" />
			<form:errors path="gender" cssClass="error"></form:errors>
			<br>
			Faculty: <form:select path="faculty">
				<form:option value="">Chọn khoa</form:option>
				<form:options items="${faculties}" />
			</form:select>
			<form:errors path="faculty" cssClass="error"></form:errors>
			<br>
			Hobbies: <form:checkboxes path="hobbies" items="${hobbies}" />
			<form:errors path="hobbies" cssClass="error"></form:errors>
			<br>
			<button>Save</button>
		</form:form>
</body>
</html>
