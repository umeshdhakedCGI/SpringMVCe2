package com.stackroute.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    User user;

    @RequestMapping("/welcomeNote")
    public ModelAndView welcomeNote(@RequestParam("name") String name,@RequestParam("pwd") String pwd){

        user.setName(name);
        user.setPsw(pwd);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",user);

        return mv;
    }


}
