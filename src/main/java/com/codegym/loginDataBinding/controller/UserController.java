package com.codegym.loginDataBinding.controller;

import com.codegym.loginDataBinding.model.Login;
import com.codegym.loginDataBinding.model.User;
import com.codegym.loginDataBinding.service.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/login")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home", "login",new Login());
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = UserDAO.checkLogin(login);
        if(user == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }else{
            ModelAndView modelAndView = new ModelAndView("user","user",user);
            return modelAndView;
        }
    }
}
