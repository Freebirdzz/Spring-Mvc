package com.shangxuefeng.mvc.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mobile.device.Device;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kevin
 */
public class MyInterceptorOne implements HandlerInterceptor {
    private static Logger logger = LoggerFactory.getLogger(MyInterceptorOne.class);
    public MyInterceptorOne(){
        System.out.println("MyInterceptorOne执行构造函数");
    }
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>> 自定义拦截器拦截到了一个请求:[" + httpServletRequest.getRequestURI() + "] <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    //    System.out.println(">>>>>>>>>>>>> 自定义拦截器---->postHandle <<<<<<<<<<<<<<<<");

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
     //   System.out.println(">>>>>>>>>>>>> 自定义拦截器---->afterCompletion <<<<<<<<<<<<<<<<");
    }
}
