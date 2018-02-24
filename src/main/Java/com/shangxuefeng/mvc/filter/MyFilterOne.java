package com.shangxuefeng.mvc.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author kevin
 */
public class MyFilterOne implements Filter {
    private FilterConfig filterConfig;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    /**
     * 三个参数对象都是由Servlet容器创建的，也就是tomcat负责的！
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("--------------------- MyFilterOne 执行开始 ----------------------");

        //继续filter链的调用过程
        chain.doFilter(request, response);

        System.out.println("--------------------- MyFilterOne 执行结束 ----------------------");
    }

    @Override
    public void destroy() {
        filterConfig = null;
    }
}
