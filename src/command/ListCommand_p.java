package command;

import javax.servlet.http.HttpServletRequest;
import service.MemberServiceImpl_p;

public class ListCommand_p {
HttpServletRequest request;
	public ListCommand_p(HttpServletRequest request) {
		this.request = request;
		execute();
	}
public void execute() {
	System.out.println("< ListCommand_p >");
	request.setAttribute("list", 
			MemberServiceImpl_p.getInstance().findList());
}
}
