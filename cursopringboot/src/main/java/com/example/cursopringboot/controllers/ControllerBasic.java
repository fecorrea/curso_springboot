package com.example.cursopringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerBasic {
    @GetMapping(path ={"/saludar", "/holamundo"})
    public String saludar(Model model){
    	model.addAttribute("name", "el modelo");
        return "index";
    }
}
