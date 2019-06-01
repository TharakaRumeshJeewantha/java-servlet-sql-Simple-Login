<%-- 
    Document   : index
    Created on : May 31, 2019, 3:36:28 PM
    Author     : GTC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <style>
            td {
                padding: 10px;
            }
        </style>
    </head>
    <body>
        <br>
        <br>
        <br>
        <br>
    <center><h1>LOGIN</h1></center> <hr>
    <center>
        <div>
            <form action="LoginServlet" method="POST">
            <table>
                <tr>
                    <td>Username</td>
                    <td><input type="text" class="form-control" name="username" placeholder="username"><br></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" class="form-control" name="password" placeholder="*********"><br></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input class="btn btn-success" type="submit" value="Submit"></td>
                </tr>
            </table>
            </form>
        </div>
    </center>
    </body>
</html>
