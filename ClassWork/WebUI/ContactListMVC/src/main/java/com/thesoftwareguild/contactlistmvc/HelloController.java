package com.thesoftwareguild.contactlistmvc;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/hello"}) // Optional, 
public class HelloController {
        
    public HelloController() {
    }
    // End value is defined by two values 
    @RequestMapping(value="/sayhi", method=RequestMethod.GET) //  Two endpoints to the same URL with same method will result in an error
    public String theNameCanBeAnything(Map<String, Object> model) {
        model.put("message", "Hello from the controller" );
        return "hello";
    }
    
        @RequestMapping(value="/sayhi", method=RequestMethod.POST) // 
    public String theNameCanBeOtherThing(Model model) { //Map<String, Object> 
//        model.put("message", "Hello from the controller" );
        model.addAttribute("message", "Hello from the controller in the POST method.");
        return "hello";
    }
}
