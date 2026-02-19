

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String usr = request.getParameter("user");
		String pas = request.getParameter("password");
		
		User obj = new User();
		
		obj.setUserName(usr);
		obj.setPassword(pas);
		
		if(usr.equals(obj.getUserName()) && pas.equals(obj.getPassword())) {
			RequestDispatcher rd = request.getRequestDispatcher("home.html");
			rd.forward(request, response);
			
		}
		else {
			out.println("<center><font color = 'red'>login failed.</font><center>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

}
