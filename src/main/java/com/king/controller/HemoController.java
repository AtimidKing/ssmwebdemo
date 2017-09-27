package com.king.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;

@Controller
public class HemoController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String welcome(Model model){
        String y = "yang";
        model.addAttribute("username",y);
        model.addAttribute("now", LocalDate.now());
        System.out.println("/welcome");
        return "welcome";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String userList(ModelMap model){
        model.addAttribute("user", "yang");
        System.out.println("/list");
        return "user-list";
    }
}
