package com.eafit.juego.controllers;



import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class homeController {

   @GetMapping("/")
   public String index(Model model) {
       model.addAttribute("title", "Bienvenido al CABA");
       model.addAttribute("subtitle", "Juegos del torneo de football de verano");
       return "home/index";
   }  
    
}