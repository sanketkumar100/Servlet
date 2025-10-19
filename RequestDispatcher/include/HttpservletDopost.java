package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

public class HttpservletDopost extends HttpServlet
{
   /* @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h2>Please submit the form using POST method.</h2>");
        out.println("</body></html>");
    }*/

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String username = req.getParameter("username");

        out.println("<html><body>");
        if (username != null && !username.isEmpty()) {
            out.println("<h2>Hello, " + username + " from HttpServlet POST</h2>");
            RequestDispatcher rd = req.getRequestDispatcher("index.html");    //accessing the html form
            rd.include(req, res);
        } else {
            out.println("<h2>Hello without username from HttpServlet POST</h2>");

        }
        out.println("</body></html>");
    }
}

