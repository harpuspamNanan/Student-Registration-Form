package studentRegistration;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet{

	public void doMethod(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String username =req.getParameter("uName");
		String password = req.getParameter("pwd");
		
		if(username.equalsIgnoreCase("Java") && password.equalsIgnoreCase("jee"))
		{
			res.sendRedirect("welcome.html");
		}
		else
		{
			res.sendRedirect("error.html");
		}
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		doMethod(req,res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		doMethod(req,res);
	}
}