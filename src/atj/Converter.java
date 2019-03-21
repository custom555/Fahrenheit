package atj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Converter")
public class Converter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String value1;
	private String calc;
	private double result;
	String jspSite;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		value1 = request.getParameter("value1");
		calc = request.getParameter("calculation");
		doPost(request, response);
		request.setAttribute("result", new Double(result));
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(jspSite);
		requestDispatcher.forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(calc.equals("F-C")) {
			result = (Double.parseDouble(value1)-32)*5/9;			
			jspSite = "converterF-C.jsp";
		}
		else {
			result = (Double.parseDouble(value1))*9/5+32;
			jspSite = "converterC-F.jsp";
		}
	}
}
