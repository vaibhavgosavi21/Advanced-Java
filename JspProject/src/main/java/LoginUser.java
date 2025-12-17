import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet ("/login")
public class LoginUser extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		System.out.println("1");
		
        
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            resp.sendRedirect("Login.jsp?error=All fields required");
            return;
        }

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("2");

			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/JspProject","root","root");
			
			System.out.println("3");

            String query = "SELECT * FROM users WHERE username=? AND password=?";
            
			System.out.println("4");

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
			System.out.println("5");


            
            ResultSet rs = ps.executeQuery();
			System.out.println("6");

            if (rs.next()) {
              
                resp.sendRedirect("Home.jsp");
            } else {
               
                resp.sendRedirect("Registration.jsp");
            }
			System.out.println("7");

            rs.close();
            ps.close();
            connection.close();


		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

	}
}
