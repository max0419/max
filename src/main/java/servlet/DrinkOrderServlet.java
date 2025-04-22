package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CoffeeOrder;
import model.DrinkOrder;

@WebServlet("/DrinkOrder")
public class DrinkOrderServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		
		String type = req.getParameter("type");
		String size = req.getParameter("size");
		String ice = req.getParameter("ice");
	
		//判斷參數
		if(type == null || size == null || ice == null) {
			resp.getWriter().print("參數輸入不正確");
			return;
		}
		//進行商業邏輯
		DrinkOrder DrinkOrder = new DrinkOrder(type , size ,  ice);
		
		//建立分派器
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/Drink_Order.jsp");
		req.setAttribute("DrinkOrder", DrinkOrder);
		rd.forward(req,resp);
		
	
	}

}
