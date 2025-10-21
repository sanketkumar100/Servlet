package org.example;

import javax.servlet.http.*;

public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent event) {
        System.out.println("🟢 Session created with ID: " + event.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        System.out.println("🔴 Session destroyed with ID: " + event.getSession().getId());
    }
}
