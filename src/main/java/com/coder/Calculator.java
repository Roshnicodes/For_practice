package com.coder;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Calculator() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String opt=req.getParameter("opt");
		String num1=req.getParameter("num1");
		String num2=req.getParameter("num2");
		Integer i1=Integer.parseInt(num1);
		Integer i2= Integer.parseInt(num2);
		if(opt.equalsIgnoreCase("add"))
		{
			int sum = i1+i2;
			pw.print(sum);
		}
		else
			if(opt.equalsIgnoreCase("sub"))
			{
				int sub=  i1-i2;
				pw.print(sub);
			}
			else
				if(opt.equalsIgnoreCase("mul"))
				{
					int mul=  i1*i2;
					pw.print(mul);
				}
				else
					if(opt.equalsIgnoreCase("div"))
					{
						int div=  i1/i2;
						pw.print(div);
					}
					else {
						pw.print("please select valid option");
						RequestDispatcher rd = req.getRequestDispatcher("/index.html");
						rd.include(req, res);
					}
	}

}
