package Server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class handle extends AbstractHandler {

	public void handle(String target, Request baserequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException 
	{
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		baserequest.setHandled(true);
		System.out.println("=========================");
		response.getWriter().println("<h1> hello jetty <h1>");
	}

}
