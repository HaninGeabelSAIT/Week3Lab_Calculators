
package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hanin
 */
public class AgeCalculatorServlet extends HttpServlet {

int ageCalulated = 0;
   String massage ; 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {                
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
               .forward(request,response);
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String age = request.getParameter("age");
         
          request.setAttribute("age", age);
         
        
         
         if (age == null || age.equals("") ){
             massage = "You must give your current age";
              request.setAttribute("massage", massage);
                 getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
                 return; 
                 
                 
    }
        
//        isInteger(age);
 try { 
      ageCalulated =  Integer.parseInt( age ); 
      
          ageCalulated++;
          massage = "Your next age next birthday will be "+ ageCalulated;
          request.setAttribute("massage", massage);
//       return massage;
    }  
    catch( Exception e ) { 
        massage = "You must enter a number.";
          request.setAttribute("massage", massage);
//        return massage; //If it doesn't work return false 
    } 
  getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);

}
// public String isInteger( String input ) { 
//   
//}     
}
