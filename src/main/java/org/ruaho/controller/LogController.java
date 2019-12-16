package org.ruaho.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static final Logger log = LoggerFactory.getLogger(Logger.class);

    @RequestMapping("/log")
    public String test() {
        log.info("---测试日志信息---");
        return "测试日志";
    }
}
