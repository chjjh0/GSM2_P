package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import command.Carrier_p;
import command.ListCommand_p;

@WebServlet("/admin")
public class AdminController_p extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminController_p() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("< AdminController_p >");
		ListCommand_p listCommand = new ListCommand_p(request);
		Carrier_p.forward(request, response);
	}
}
