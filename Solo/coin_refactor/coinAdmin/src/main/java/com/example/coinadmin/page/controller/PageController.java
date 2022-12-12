package com.example.coinadmin.page.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class PageController {
    @GetMapping("/")
    public String main() {
        return "login";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/goMember")
    public String memberList() {
        return "memberList";
    }

}
