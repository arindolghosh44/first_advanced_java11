package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	
       
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long no1,no2,result;
		no1=Long.parseLong(request.getParameter("no1"));
		no2=Long.parseLong(request.getParameter("no2"));
		System.out.println(no1+" "+no2);
		result=no1+no2;
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h1 style='width:50%;margin:10px auto;background:darkcyan;padding:10px;color:white;text-align:center;border-radius:5px'>Addition is "+result+"</h1>");
		out.println("<a href='project3.html'>Back</a>");
	}

}
