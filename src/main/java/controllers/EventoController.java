package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {

    @RequestMapping("/cad")
    public String form(){
        return "evento/formEvento";
    }
}
