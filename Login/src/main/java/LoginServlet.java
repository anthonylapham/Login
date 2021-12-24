

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String getUsername = request.getParameter("userNameRegister");
		String getEmail = request.getParameter("emailRegister");
		String getPassword = request.getParameter("passwordRegsiter");
		String getRepeatPassword = request.getParameter("passwordRepeat");
		
		if(!getPassword.equals(getRepeatPassword)) {
			writer.println("<h2>Passwords must match. Please try again!</h2>");
		}
		
		writer.println("<h2>Thank you for Registering!</h2>");
		writer.println("<h3>Please use the following information to Login:</h3>");
		writer.println(getUsername);
		writer.println("<br>");
		writer.println(getPassword);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
