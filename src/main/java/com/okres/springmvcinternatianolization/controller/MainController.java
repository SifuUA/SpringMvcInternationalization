package com.okres.springmvcinternatianolization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alex on 30.07.2017.
 */
@Controller
public class MainController {

//    @RequestMapping(value = "/login1")
//    public String login1(Model model){
//        return "login1";
//    }

    @RequestMapping(value = "/{locale:en|ru|ua}/login2")
    public String login2(Model model){
        return "login2";
    }
}
