package edu.mum.cs.cs425.demowebapps.elibrary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping(value = {"/","/home"})
    public  String displayHomepage(){
        return "home/index";
    }
}
