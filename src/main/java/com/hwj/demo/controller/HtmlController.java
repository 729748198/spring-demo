package com.hwj.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 贺文杰
 * 2018/12/26 15:10
 */
@Controller
@RequestMapping("html")
public class HtmlController {
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "world");

        return "hello";
    }
    @RequestMapping("/adminLte")
    public  String adminlte(){
        return "adminLTE";
    }

}
