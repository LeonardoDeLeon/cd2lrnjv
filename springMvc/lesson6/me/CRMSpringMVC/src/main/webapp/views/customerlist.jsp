<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRM Application</title>
</head>
<style>
    body {
        font-family: 'Courier New', Courier, monospace;
    }
    .wrapper {
        margin-top: 20px;
    }
    .outer {
        background-color: bisque;
        display: flex;
        justify-content: space-around;
        text-align: center;
        width: 80%;
        margin: 5px;
        border-radius: 3px;

    }
    .inner {
        margin: 5px 10px;
        align-items: center;
        width: 60%;
        padding: 10px;     
    }
    a {
        width: 25%;
        padding: 10px 20px;
        text-decoration: none;
        cursor: pointer;
        border: none;
        border-radius: 5px;
        margin: 5px;
        background-color: floralwhite;
        color: brown;
    }
    a:hover {
        background-color: coral;
        color: bisque;
    }
</style>
<body>
    <center>
        <h1>Customer Relationship Management Application</h1>
        <a href="showform">Register</a>
        <div class="wrapper">
            <div class="outer">
                <div class="inner">
                    Id
                </div>
                <div class="inner">
                    First Name
                </div>
                <div class="inner">
                    Last Name
                </div>
                <div class="inner">
                    City
                </div>
                <div class="inner">
                    Update Info
                </div>
                <div class="inner">
                    Delete Info
                </div>
            </div>
            <c:forEach var="customer" items="${customers}">
                <c:url var="updateLink" value="/updateForm">
                    <c:param name="customerId" value="${customer.id}"></c:param>
                </c:url>
                <c:url var="deleteLink" value="/deleteData">
                    <c:param name="customerId" value="${customer.id}"></c:param>
                </c:url>                
                <div class="outer">
                    <div class="inner">
                        ${customer.id}
                    </div>
                    <div class="inner">
                        ${customer.firstName}
                    </div>
                    <div class="inner">
                        ${customer.lastName}
                    </div>
                    <div class="inner">
                        ${customer.city}
                    </div>
                    <div class="inner">
                        <a href="${updateLink}">Update</a>
                    </div>
                    <div class="inner">
                        <a href="${deleteLink}">Delete</a>
                    </div>
                </div>
            </c:forEach>
        </div>
    </center>
</body>
</html>