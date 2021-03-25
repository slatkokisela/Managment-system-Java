package com.boka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	public void doPost(HttpServletRequest req1, HttpServletResponse res2) throws IOException
	{
		
		int x=Integer.parseInt(req1.getParameter("num3"));
		int y=Integer.parseInt(req1.getParameter("num4"));
		
		int z=x+y;
		
	    PrintWriter out1=res2.getWriter();
	    out1.println("rezultat je"+z);
	    
		
	}
	
	
	
	
}
