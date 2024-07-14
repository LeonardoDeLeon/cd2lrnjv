<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data from Array</title>
</head>
<body>
    <center>
        <h1 style="color:red; text-align:center">Display data from an array</h1>
        <b>Name of book</b>
        <c:forEach var="booksName" items="${books}">${booksName}</c:forEach>
    </center>
</body>
</html>