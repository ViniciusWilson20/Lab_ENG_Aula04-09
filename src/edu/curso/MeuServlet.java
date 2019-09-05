package edu.curso;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/MeuServelt")

public class MeuServlet implements Servlet{

	private ServletConfig cfg;
	@Override
	public void destroy() {
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return this.cfg;
	}

	@Override
	public String getServletInfo() {
		
		return "Esse é meu 	Pai";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("Init está sendo executado");
		this.cfg = config;
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String n = req.getParameter("NOME");
		String i = req.getParameter("IDADE");
		System.out.println("Serviço está sendo executado");
		PrintWriter out = res.getWriter();
		out.println("<h1>Olá " + n + " Bem Vindo ao Meu Servlet </h1>");
		out.flush();
		
	}

}
