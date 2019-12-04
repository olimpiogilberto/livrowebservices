package br.com.livro.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello2")
public class HelloServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String sobrenome = req.getParameter("sobrenome");
		
		resp.getWriter().print("Olá mundo Servlet2");
		resp.getWriter().print("<br>" + nome + " " + sobrenome +"<br> "
				+ "Funciona com apache tomcat 7.0.54");
	}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			String nome = req.getParameter("nome");
			String sobrenome = req.getParameter("sobrenome");
			resp.getWriter().print("Olá mundo POST " + nome + " " + sobrenome);
	}
	
}
