package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet4")
public class Servlet4 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long no,result=1l;
		no=Long.parseLong(request.getParameter("no1"));
	
		for(int i=1;i<=no;i++)
		{
			result=result*i;
		}	
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h1 style='width:50%;margin:10px auto;background:darkcyan;padding:10px;color:white;text-align:center;border-radius:5px'>Factorial of"+ no+" "+result+"</h1>");
		out.println("<a href='project4.html'>Back</a>");
	}

}
