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
    <form action="" method="post">
        <div>
            <label for="id">Id</label>
            <input type="text" name="id">
        </div>
        <div>
            <label for="iname">Name</label>
            <input type="text" name="iname">           
        </div>
        <div>
            <label for="icity">City</label>
            <input type="text" name="icity">
        </div>
        <div>
            <label for="isalary">Salary</label>
            <input type="text" name="isalary">
        </div>
        <div>
            <input type="submit">
        </div>
    </form>
</body>
</html>