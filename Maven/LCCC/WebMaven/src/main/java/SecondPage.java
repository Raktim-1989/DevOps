

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondPage
 */
@WebServlet("/SecondPage")
public class SecondPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondPage() {
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String searched = request.getParameter("languageName");
		
		if(searched.equals("java"))
			out.println("<html>"
					+ "<body><a href=\"FirstPage\">Back<a/><br/>"
					+ "www.tutorialspoint.com<br/>"
					+ "www.roseindia.com<br/>"
					+ "www.java2s.com<br/>"
					+ "www.javabrains.com</body></html>");
		else if(searched.equals("c"))
			out.println("<html>"
					+ "<body><a href=\"FirstPage\">Back<a/><br/>"
					+ "www.cprogramming.com<br/>"
					+ "www.howstuffworks.com<br/>"
					+ "www.programiz.com</body></html>");	
		else if(searched.equals("c++"))
			out.println("<html>"
					+ "<body><a href=\"FirstPage\">Back<a/><br/>"
					+ "www.cplusplus.com<br/>"
					+ "www.learncpp.com<br/>"
					+ "www.stroustrup.com</body></html>");
		else
			response.sendRedirect("Index");
	}

}
