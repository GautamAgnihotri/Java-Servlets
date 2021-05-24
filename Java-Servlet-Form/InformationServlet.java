package MyInfo;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;



public class InformationServlet extends HttpServlet {

   
    

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
               
                out.println("<h2>Welcome to Information Servlet</h2>");
                String name= request.getParameter("user_name");
                String enrollment_no= request.getParameter("user_enroll");
                String gender= request.getParameter("user_gender");
                String year= request.getParameter("user_year");
                String sem= request.getParameter("user_section");
                
                out.println("<h2> Name : "+ name +"</h2>");
                out.println("<h2> Enrollment Number : "+ enrollment_no +"</h2>");
                out.println("<h2> Gender : "+ gender +"</h2>");
                out.println("<h2> Year : "+ year +"</h2>");
                out.println("<h2> Semester : "+ sem +"</h2>");
                
        }
        
    }

