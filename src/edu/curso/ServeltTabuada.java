package edu.curso;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Tabuada")
public class ServeltTabuada implements Servlet {

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
		return "Calcular Tabuada";
	}

	@Override
	public void init(ServletConfig init) throws ServletException {
		this.cfg = init;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String numero = req.getParameter("NUMERO");
		int tab;
		int num;
		if (numero.equals("")) {
			num = 7;
		} else {
			num = Integer.parseInt(numero);
		}
		for (int i = 0; i <= 10; i++) {

			tab = num * i;
			PrintWriter out = res.getWriter();
		    out.println(num + " x " + i + " = " + tab);
		}
	}
}
