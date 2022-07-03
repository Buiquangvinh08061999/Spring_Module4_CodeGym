package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertUSD {

    @GetMapping("/convert")
    public String convert(@RequestParam double usd, double vnd ,Model model){

        double VND = usd * 23000;
        double USD = vnd / 23000;

        model.addAttribute("usd", usd);
        model.addAttribute("vnd", vnd);

        model.addAttribute("USD", USD);
        model.addAttribute("VND", VND);

        return "result";

    }




}
