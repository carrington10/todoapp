package com.in28minutes.springboot.webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // need to tell spring boot what type of class this is 
public class SayHelloController {
    // " say hello" respond back a string 
    @RequestMapping("say-hello")  // maps a request url to this function
    @ResponseBody // returns back what is requested to the browser
    public String sayHello(){
            return " hello! what are you learning today";
    }// end of say hello
 // jsp method 
    @RequestMapping("say-hello-jsp")
    public String sayHellojsp(){
    // jsp - java server pages 
            return "sayhello";
    }// end of say hellohtml
}// end of sayhellocontroller
