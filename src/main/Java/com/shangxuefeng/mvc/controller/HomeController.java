package com.shangxuefeng.mvc.controller;

import com.google.common.collect.Lists;
import com.shangxuefeng.mvc.bean.Foo;
import com.shangxuefeng.mvc.bean.MyObject;
import com.shangxuefeng.mvc.common.ErrorCode;
import com.shangxuefeng.mvc.common.GetObjectRequest;
import com.shangxuefeng.mvc.common.GetObjectResponse;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

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


    /**
     *
     * @param foo 待验证的参数
     * @param bindingResult 验证结果，具体可以再代码里对验证结果进行判断
     * @return
     */
    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String check(@Valid Foo foo, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "check-error";
        }
        return "check";
    }

    @RequestMapping(value = "/filter", method = RequestMethod.GET)
    public String filter(@Valid Foo foo, BindingResult bindingResult){
        logger.info(">>>>>>>>>>>>>>>>>>>>>>> Home控制器的filter方法，映射url：/home/filter <<<<<<<<<<<<<<<<<<<<<<<<");
        return "check";
    }


    @ResponseBody
    @RequestMapping(value="/getObjects", method=RequestMethod.GET)
    public GetObjectResponse getObjects(@Valid GetObjectRequest request, BindingResult bindingResult){
        GetObjectResponse response = new GetObjectResponse();
        if (bindingResult.hasErrors()){
            logger.error(bindingResult.getAllErrors().toString());
            response.setCode(ErrorCode.PARAM_ERROR);
            response.setMessage(bindingResult.getAllErrors().toString());
        } else{
            List<MyObject> list = Lists.newArrayList();
            for (int i=100;i<1000;i += 100){
                MyObject myObject = new MyObject();
                myObject.setAddr("Addr-" + i);
                myObject.setId(i);
                myObject.setName("MyObject[" + i + "]");
                list.add(myObject);
            }
            response.setCode(ErrorCode.SUCCESS);
            response.setData(list);
        }
        return response;
    }


}
