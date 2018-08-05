package command;

import javax.servlet.http.*;

public class Carrier_p {
	public static void forward(HttpServletRequest request, HttpServletResponse response) {
		try {
			System.out.println("< Carrier_p >");
			request
			.getRequestDispatcher(
					"/WEB-INF/view/admin/adminMain_p.jsp")
			.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}