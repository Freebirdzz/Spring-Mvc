package com.shangxuefeng.mvc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author kevin
 * HttpServlet是针对Http请求定义的Servlet
 */
public class MyServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("====== Get Request ======");
        resp.getWriter().print("<html><body><h1>Response OK.</h1></body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("====== Post Request ======");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("====== 重写了destroy方法，应该是在tomcat停止的时候被调用 ======");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("====== 重写了HttpServlet的init方法() ======");
    }


}
