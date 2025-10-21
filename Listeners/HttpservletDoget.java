package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpservletDoget extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String username = req.getParameter("username");

        out.println("<html><body>");
        if (username != null && !username.isEmpty()) {
            out.println("<h2>Hello, " + username + " from HttpServlet</h2>");
        } else {
            out.println("<h2>Hello without username from HttpServlet</h2>");
        }
        out.println("</body></html>");
    }
}

