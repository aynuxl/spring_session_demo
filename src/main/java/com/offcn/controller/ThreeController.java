package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThreeController {
    @GetMapping("/three")
    public String thre(){
        System.out.println("333333333333");
        return "ok";
    }
}
