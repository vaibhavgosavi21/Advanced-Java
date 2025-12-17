import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterUser extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		System.out.println("1");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("2");

			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/JspProject","root","root");
			String query="insert into users (username,password,email) values(?,?,?)";
			System.out.println("3");

			PreparedStatement statement=connection.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, password);
			statement.setString(3, email);
			System.out.println("4");

			int result=statement.executeUpdate();
			System.out.println("5");

			System.out.println("Query ok "+result+"rows affected");
			
			connection.close();
			statement.close();
			
			resp.sendRedirect("Login.jsp");

			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
