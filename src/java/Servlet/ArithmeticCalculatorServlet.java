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
public class ArithmeticCalculatorServlet extends HttpServlet {

    int Result;
    String sms;
    double parmeter;
    double parmeter1;
    String buttonValue;
    double finalResult;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first = request.getParameter("first");

        String second = request.getParameter("second");
        request.setAttribute("first", first);
        request.setAttribute("second", second);

        if ((first == null || first.equals("")) && (second == null || second.equals(""))) {
            sms = "---";

            request.setAttribute("sms", sms);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

        }
        if (first == null || first.equals("") || second == null || second.equals("")) {
            sms = "invalid";
            request.setAttribute("sms", sms);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

        }

        try {
            buttonValue = request.getParameter("button");
            parmeter = Double.parseDouble(first);
            parmeter1 = Double.parseDouble(second);
            if (buttonValue.equals("+")) {
                finalResult = parmeter + parmeter1;
            } else if (buttonValue.equals("-")) {
                finalResult = parmeter - parmeter1;
            } else if (buttonValue.equals("*")) {
                finalResult = parmeter * parmeter1;
            } else {
                finalResult = parmeter % parmeter1;
            }

            Result = (int) finalResult;
            sms = String.valueOf(Result);
            request.setAttribute("sms", sms);
        } catch (Exception e) {
            sms = "invalid";
            request.setAttribute("sms", sms);

        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}


