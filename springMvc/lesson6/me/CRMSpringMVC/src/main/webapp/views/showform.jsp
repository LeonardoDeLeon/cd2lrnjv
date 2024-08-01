<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register here</title>
</head>
<style>
    body {
        font-family:'Courier New', Courier, monospace;
    }
    .outer {
        width: 25%;
        background-color: bisque;
        margin: auto;
    }
    .reg-form {
        padding: 5px 10px;
        border-radius: 3px;
    }
    .inner {
        display: flex;
        justify-content: space-between;
        padding: 5px;
    }
    label {
        padding: 5px 0;

    }
    .input-text {
        width: 65%;
        border: none;
        padding: 5px;
        border-radius: 3px;
    }
    input[type=submit] {
        padding: 10px 20px;
        margin: 5px;
        border: none;
        border-radius: 5px;
        background-color:burlywood;
        color: brown;
        cursor: pointer;
    }
    input[type=submit]:hover {
        background-color:coral;
        color: bisque;
        cursor: pointer;
    }
</style>
<body>
    <div class="outer">
        <form:form action="registerCustomer" class="reg-form" modelAttribute="customer">
            <div>
                <h1>
                    Register here
                </h1>
            </div>
            <div class="inner">
                <label for="id">Id</label>
                <form:hidden path="id" class="input-text" />
            </div>
            <div class="inner">
                <label for="firstName">First Name</label>
                <form:input path="firstName" class="input-text" />
            </div>
            <div class="inner">
                <label for="lastName">Last Name</label>
                <form:input path="lastName" class="input-text" />
            </div>
            <div class="inner">
                <label for="city">City</label>
                <form:input path="city" class="input-text" />
            </div>
            <input type="submit" value="Register">
        </form:form>
    </div>

</body>
</html>