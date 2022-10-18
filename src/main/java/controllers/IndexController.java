package controllers;


import org.springframework.web.bind.annotation.RequestMapping;


public class IndexController {

    @RequestMapping("/")
    public String IndexController(){
        return "index";
    }
}
