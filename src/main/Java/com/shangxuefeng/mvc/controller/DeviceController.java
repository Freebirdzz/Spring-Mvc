package com.shangxuefeng.mvc.controller;

import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/device")
public class DeviceController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(HttpServletRequest request) {
        Device currentDevice = DeviceUtils.getCurrentDevice(request);
        if (currentDevice.isMobile()){
            return "mobile";
        } else{
            return "pc";
        }
    }
}
