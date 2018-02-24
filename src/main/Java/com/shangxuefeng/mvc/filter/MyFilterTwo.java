package com.shangxuefeng.mvc.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author kevin
 */
public class MyFilterTwo implements Filter {
    private FilterConfig filterConfig;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    /**
     * 三个参数对象都是有Servlet容器创建的
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("--------------------- MyFilterTwo 第二个过滤器执行开始 ----------------------");

        //执行其他的过滤器内容
        chain.doFilter(request, response);

        System.out.println("--------------------- MyFilterTwo 第二个过滤器执行结束 ----------------------");
    }

    @Override
    public void destroy() {
        filterConfig = null;
    }
}
