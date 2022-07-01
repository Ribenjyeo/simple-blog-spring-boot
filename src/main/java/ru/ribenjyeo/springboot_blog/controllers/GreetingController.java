package ru.ribenjyeo.springboot_blog.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/about")
    public String about (@RequestParam(name="name", required=false, defaultValue="not found") String name, Model model) {
        model.addAttribute("name", "ABOUT");
        return "about";
    }

}