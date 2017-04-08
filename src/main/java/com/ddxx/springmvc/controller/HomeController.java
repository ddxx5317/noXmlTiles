package com.ddxx.springmvc.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddxx.springmvc.service.HelloService;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    HelloService helloService;
    
    @RequestMapping(value="/index",method=RequestMethod.GET)
    public  String home() {
        return "home";
    }
    @RequestMapping("/page")
    public String homePage(@RequestParam("name") String name, ModelMap model,Map<String,Object> map) {
        model.put("greeting", helloService.getHello(name));
        return "home";
    }

}