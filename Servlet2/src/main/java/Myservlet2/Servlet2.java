package Myservlet2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class Servlet2 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		String name=req.getParameter("username");
		String pass=req.getParameter("pass");
		writer.println("<h1>Hello"+name+" , good afternoon</h1>");
		writer.println("<h1> your password:"+pass+"</h1>");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		this.doPost(req, resp);
	}

}
