package com.koukou.keaexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartsideController {

    @GetMapping("/index")
    public String showHomepage() {
        return "index";
    }


}
