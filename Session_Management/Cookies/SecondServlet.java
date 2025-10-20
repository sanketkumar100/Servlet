package org.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Get all cookies from request
        Cookie[] cookies = req.getCookies();

        String name = null;
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    name = c.getValue();
                    break;
                }
            }
        }

        out.println("<html><body>");
        if (name != null)
            out.println("<h2>Welcome back, " + name + " (from cookie)</h2>");
        else
            out.println("<h2>No user found. Please visit FirstServlet first.</h2>");
        out.println("</body></html>");
    }
}
