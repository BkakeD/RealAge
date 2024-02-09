package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.YearConverter;

/**
 * Servlet implementation class getTimeServlet
 */
@WebServlet("/getTimeServlet")
public class getTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTimeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userYears = request.getParameter("userYears");
		
		YearConverter userTime = new YearConverter(Integer.parseInt(userYears));
		
		request.setAttribute("userTimeFile", userTime);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request,  response);
	}

}
