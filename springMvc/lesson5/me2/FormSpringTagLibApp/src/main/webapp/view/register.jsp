<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alienators Learning Registration</title>
</head>
<style>
    body {
        background-color: aqua;
        text-align: center;
        margin: auto;
    }
    form {
        width: 20%;
        margin: auto;

    }
    div {
        display: flex;
        justify-content: space-between;
    }
</style>
<body>
    <h1>Registration Application</h1>
    <form:form action="" method="post" modelAttribute="impl">
        <div>
            <label for="id">Id</label>
            <form:input path="id" />
        </div>
        <div>
            <label for="iname">Name</label>
            <form:input path="iname" />           
        </div>
        <div>
            <label for="icity">City</label>
            <form:input path="icity" />
        </div>
        <div>
            <label for="isalary">Salary</label>
            <form:input path="isalary" />
        </div>
        <div>
            <input type="submit">
        </div>
    </form:form>
</body>
</html>