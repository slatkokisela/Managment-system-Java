package com.boka;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet{
	

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
	
		PrintWriter out=res.getWriter();
		
		out.println("result is:"+k);
		
		
	}
	
	
	
	
	

}
