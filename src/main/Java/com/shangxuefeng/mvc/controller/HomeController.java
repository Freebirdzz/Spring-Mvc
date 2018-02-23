package com.shangxuefeng.mvc.controller;

import com.shangxuefeng.mvc.bean.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @author kevin
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {
    private Logger logger = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping(value = "/one", method = RequestMethod.GET)
    public String one() {
        logger.info(">>>>>>>>>>>>>>Home控制器test方法，[映射url：/home/one]<<<<<<<<<<<<<<<<");
        return "one";
    }


    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String check(@Valid Foo foo, BindingResult bindingResult){
        logger.info(">>>>>>>>>>>>>>Home控制器test方法，[映射url：/home/check]<<<<<<<<<<<<<<<<");
        return "check";
    }

}
