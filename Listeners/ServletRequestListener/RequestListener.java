package org.example;

import javax.servlet.*;

public class RequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent event) {
        System.out.println("➡️ Request initialized");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent event) {
        System.out.println("⬅️ Request destroyed");
    }
}
