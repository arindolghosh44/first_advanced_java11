package project1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Studentadd")
public class StudentAdd extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","password");
			
			String fullname,emailAdd,reg;
			int num;
			reg=request.getParameter("register");
			fullname=request.getParameter("FullName");
			emailAdd=request.getParameter("emailAdd");
			num=Integer.parseInt(request.getParameter("Mobile"));
			
			
			String sql="insert into student (registration,FullName,email,mobile)values (?,?,?,?)";
			
			PreparedStatement st=conn.prepareStatement(sql);
			st.setString(1,reg);
			st.setString(2,fullname);
			st.setString(3,emailAdd);
			st.setInt(4, num);
			
			st.executeUpdate();
			st.close();
			conn.close();
			
			
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			out.println("<h1 style='width:50%;margin:10px auto;background:darkcyan;padding:10px;color:white;text-align:center;border-radius:5px'> Registartion Successful </h1>");
			out.println("<a href='project4.html'>Back</a>");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
