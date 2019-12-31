package org.ruaho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/index")
    public String index(String index) {
        return index;
    }

    @RequestMapping("/login")
    public String login(String login) {
        return login;
    }
}
