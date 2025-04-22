package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Latte;



@WebServlet("/latte")
public class LatteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/latte_form.jsp");
		rd.forward(req,resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String miklAmount = req.getParameter("milk");
		String coffeeAmount = req.getParameter("coffee");
		
		Latte latte = new Latte(miklAmount, coffeeAmount);
		resp.getWriter().print(coffeeAmount);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/latte_result.jsp");
		req.setAttribute("latte", latte);
		rd.forward(req, resp);
	}

}
