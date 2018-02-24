package com.shangxuefeng.mvc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("----------------- 自定义监听器MyServletContextListener，实现了ServletContextListener接口的contextInitialized方法 --------------------");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("----------------- 自定义监听器MyServletContextListener，实现了ServletContextListener接口的contextDestroyed方法 ----------------- ");
    }
}
