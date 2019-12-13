package org.ruaho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value="/{module}/{module2}/{name}")
    public String commonController(@PathVariable String module, @PathVariable String module2, @PathVariable String name) {
        return module+"/"+module2+"/"+name;
    }

    @RequestMapping(value="/{module}/{name}")
    public String commOnController(@PathVariable String module, @PathVariable String name) {
        return module+"/"+name;
    }

    @RequestMapping(value="/{name}")
    public String commOnController(@PathVariable String name) {
        return name;
    }

}
