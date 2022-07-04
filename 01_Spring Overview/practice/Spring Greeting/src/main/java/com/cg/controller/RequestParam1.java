package com.cg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestParam {
    @RequestMapping("/demo")
    public String demo(@org.springframework.web.bind.annotation.RequestParam){
        return "indexText";
    }
}
