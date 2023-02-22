package com.in28minutes.springboot.webapp.login;

import org.slf4j.Logger; // logging 
import org.slf4j.LoggerFactory; // logging 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    //http
     private Logger log = LoggerFactory.getLogger(getClass());
    // model put it into model
    @RequestMapping("login")
     public String gotoLoginPage(@RequestParam String name, ModelMap model){
        model.put("name",name);  // model map class
        log.debug("request params is {}", name); // logging will never be printed to prod logs
        log.info(" I want to print this "); // loging
        return "login";
     }// end of login page 
}// end of login controller 
