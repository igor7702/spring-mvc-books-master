package com.javamaster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddRaceController {

    @GetMapping("/addRace")
    public String home(@RequestParam(required = false) String login, Model model) {
        System.out.println("login is: " + login);
        model.addAttribute("login", login);
        return "addRace_page";
    }
}
