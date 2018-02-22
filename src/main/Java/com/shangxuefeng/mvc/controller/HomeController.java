package com.shangxuefeng.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kevin
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(value = "/one", method = RequestMethod.GET)
    public String test() {
        String str = ">>>>>>>>>>>>>>Home控制器test方法，[映射url：/home/one]<<<<<<<<<<<<<<<<";
        System.out.println(str);
        return "one";
    }

}
