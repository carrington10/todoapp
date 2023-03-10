package com.in28minutes.springboot.webapp.login;

import org.slf4j.Logger; // logging 
import org.slf4j.LoggerFactory; // logging 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name") // ENSURE session attributes exist longer 
public class LoginController {

   private Authenticationlog  service;

   
    public LoginController(Authenticationlog service) {
      super();
      this.service = service;
   }

   //http
     private Logger log = LoggerFactory.getLogger(getClass());
    // model put it into model
    @RequestMapping(value="login",method = RequestMethod.GET)
     public String gotoLoginPage(){
        return "login";
     }// end of login page 

     @RequestMapping(value="login",method = RequestMethod.POST)
     public String gotoWelcomepage(@RequestParam String name, @RequestParam String password, ModelMap map){
        map.put("name", name);
        map.put("password",password);
        if(service.authenticate(name,password)){
        //authentification 
        // name = carrington
        // password = password 
        return "welcome";
        }
        
         map.put("errorMessage","invalid creds! please try again  ");
            return "login";
     }// end of login page 
}// end of login controller 
