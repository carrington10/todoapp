package com.in28minutes.springboot.webapp.login;

import org.springframework.stereotype.Service;

@Service  // makes it to weare it autowiring constructor 
public class Authenticationlog {
     public boolean authenticate(String username, String password )
     {
        boolean isValid= username.equalsIgnoreCase("lord");
        boolean passValid = password.equalsIgnoreCase("dummy");
        return isValid && passValid;
     } // end of boolean 
}// end of authentication
