package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Long no,result=1l;
		no=Long.parseLong(request.getParameter("no1"));
	
		for(int i=1;i<=no;i++)
		{
			result=result*i;
		}
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h1 style='width:50%;margin:10px auto;background:darkcyan;padding:10px;color:white;text-align:center;border-radius:5px'>Factorial of"+ no+" "+result+"</h1>");
		out.println("<a href='project1.html'>Back</a>");
	}

}
