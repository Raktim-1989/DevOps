

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstPage
 */
@WebServlet("/FirstPage")
public class FirstPage extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String htmlresponse = "<html>";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		htmlresponse += "<body><form name = \"dataForm\" method = \"post\" action = \"SecondPage\">";
		htmlresponse += "Enter The Language<input type = \"text\" name = \"languageName\"><br/>";
		htmlresponse += "<input type = \"submit\" value = Submit Query><br/>";
		htmlresponse += "<a href = \"Index\">Logout</a></form></body></html>";
			out.println(htmlresponse);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username;
		String password;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		username = request.getParameter("username");
		password = request.getParameter("password");
		if(username.equals("admin")&&password.equals("admin")){
			String htmlresponse = "<html>";
			htmlresponse += "<body><form name = \"dataForm\" method = \"post\" action = \"SecondPage\">";
			htmlresponse += "Enter The Language<input type = \"text\" name = \"languageName\"><br/>";
			htmlresponse += "<input type = \"submit\" value = Submit Query><br/>";
			htmlresponse += "<a href = \"Index\">Logout</a></form></body></html>";
			out.println(htmlresponse);
		}
		else
			response.sendRedirect("Index");
	}

}
