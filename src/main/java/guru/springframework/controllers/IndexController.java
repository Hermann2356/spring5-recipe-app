package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * created by Hermann Sterling on 10/10/20
 */
@Controller
public class IndexController {

    @RequestMapping({"/","/index","/index.html"})
    public String getIndexPage(){
        return "index";
    }
}
