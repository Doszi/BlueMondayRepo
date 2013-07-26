package servlets.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet("/GreetingServlet")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

    protected void doPost(HttpServletRequest request, HttpServletResponse resp)
    throws ServletException, IOException {        
        
        //response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
        String login = request.getParameter("Login").toString();
        String password = request.getParameter("Password").toString();
        
        if ("doszi".equals(login) && "haslo".equals(password)) {
			response(resp, "login ok");
		} else {
			response(resp, "invalid login");
		}

    }
    
    private void response(HttpServletResponse resp, String msg)
			throws IOException {
			PrintWriter out = resp.getWriter();
			out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Login </title>");
	        out.println("</head>");
	        out.println("<body>");
	        //out.println("<h1>Servlet GreetingServlet at " + request.getContextPath () + "</h1>");
	        out.println("<h1>You are logged to the server" + "</h1>");
	        out.println("<p>Welcome " + msg + "</p>");
	        out.println("</body>");
	        out.println("</html>");

	       // out.close();
	}

}
