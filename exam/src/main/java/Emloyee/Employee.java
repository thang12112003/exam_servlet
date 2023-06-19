package Emloyee;
import com.example.exam.ValidationUtils;
import com.example.exam.db.DBConnection;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Employee extends HttpServlet {
    public static Connection conn = DBConnection.getConnection();
    public static ResultSet getAll() {
        ResultSet rs = null;
        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery("select * from employee");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            return rs;
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String fullName = request.getParameter("fullName");
        String birthday = request.getParameter("birthday");
        String address = request.getParameter("address");
        String position = request.getParameter("position");
        String department = request.getParameter("department");


        if (id.isEmpty() || fullName.isEmpty() || birthday.isEmpty() || address.isEmpty()
                || position.isEmpty() || department.isEmpty()) {
            response.getWriter().println("Please fill in all fields!");
        } else if (!ValidationUtils.isValidDate(birthday)) {
            response.getWriter().println("Invalid date format! Use yyyy-MM-dd.");
        } else {
            try {

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","thang1211@");


                String query = "INSERT INTO Employee (id, full_name, birthday, address, position, department) "
                        + "VALUES (?, ?, ?, ?, ?, ?)";

                // Tạo prepared statement
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, Integer.parseInt(id));
                statement.setString(2, fullName);
                statement.setString(3, birthday);
                statement.setString(4, address);
                statement.setString(5, position);
                statement.setString(6, department);


                statement.executeUpdate();

                response.getWriter().println("Employee saved successfully!");


                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }




}