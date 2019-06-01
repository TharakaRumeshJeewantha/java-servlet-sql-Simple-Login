
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


public class LoginServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String _username = request.getParameter("username");
            String _password = request.getParameter("password");
            try {
                if(_username != null ) {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_servlet_login","root","");
                    String Query = "SELECT * FROM tbl_users WHERE username = ? AND password = ?";
                    PreparedStatement psm = con.prepareStatement(Query);
                    psm.setString(1, _username);
                    psm.setString(2, _password);
                    ResultSet rs = psm.executeQuery();
                    if(rs.next()) {
                        response.sendRedirect("home.jsp");
                    }
                    else {
                        out.println("Invalid username or password");
                    }
                }   
            }
            catch (Exception ex) {
                out.println("Exception : " + ex.getMessage());
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
