package com.gvmmpg.standardec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public/home")
public class HomeController {

    @GetMapping
    public String loadHomePage() {
        return "main/public/home";
    }
}
