package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestToGitHubController {
    @GetMapping("/test1")
    public String test(){
        System.out.println("11111");
        return "ok";
    }
}
