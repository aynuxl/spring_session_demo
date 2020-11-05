package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SecondThymeleafController {
    @GetMapping("/second")
    public String indexPage(Model model){
        String me="hello";
        User user = new User();
        Map<String,Object> map=new HashMap();
        user.setId(1);
        user.setName("张三");
        user.setAge(20);
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("message",me);
        model.addAttribute("user",user);
        model.addAttribute("src",map);
        return "index2";
    }
    @GetMapping("/three")
    public String indexPage2(Model model){
        List<User> list=new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(20);
        list.add(user);
        User user2 = new User();
        user2.setId(2);
        user2.setName("张三2");
        user2.setAge(202);
        list.add(user2);
        User user3 = new User();
        user3.setId(3);
        user3.setName("张三3");
        user3.setAge(203);
        list.add(user3);
        model.addAttribute("userList",list);
        return "index3";
    }
    @GetMapping("/four")
    public String indexPage3(Model model){
        model.addAttribute("userName","优就业");
        model.addAttribute("href","http://www.baidu.com");
        return "index4";
    }
    @GetMapping("/five")
    public String indexPage4(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");

        return "index5";
    }
    @GetMapping("/six")
    public String indexPage5(Model model){
        model.addAttribute("flag","no");
        model.addAttribute("menu","zs");
        model.addAttribute("manager","admin");

        return "index6";
    }

}
