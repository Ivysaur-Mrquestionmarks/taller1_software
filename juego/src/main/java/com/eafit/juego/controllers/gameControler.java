package com.eafit.juego.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class gameControler {

       private static final List<Map<String, String>> games = new ArrayList<>(List.of(
       Map.of("creator", "Juan", "teams", "Rojo y verde", "Fecha", "2do de julio", "name", "Primer juego de la primera ronda del torneo"),
       Map.of("creator", "Juan", "teams", "azul y amrillo", "Fecha", "3ero de julio", "name", "segundo juego de la primera ronda del torneo"),
       Map.of("creator", "Juan", "teams", "Gandores de la primera y segunda ronda del torneo", "Fecha", "2do de julio", "name", "primer juego de la seugunda ronda del torneo")
   ));

    @GetMapping("/juegos/create")
   public String create(Model model) {
       model.addAttribute("title", "Crear un juego");
       model.addAttribute("subtitle", "Crear juegos");
       model.addAttribute("gameForm", new JuegoForm());
       return "juego/create";
   }

    @PostMapping("/juego/save")
   public String save(@Valid @ModelAttribute("gameForm") JuegoForm gameForm, BindingResult result, Model model) {
       if (result.hasErrors()) {
           model.addAttribute("title", "Create Product");
           return "juego/create";
       }

       // Simulación de guardar el producto en la lista (sin persistencia en DB)
       Map<String, String> newgame = new HashMap<>();
       newgame.put("id", String.valueOf(games.size() + 1));
       newgame.put("name", gameForm.getName());
       newgame.put("creator", gameForm.getCreator());
       newgame.put("teams", gameForm.getTeams());
       newgame.put("Fecha",  "Fecha: " + gameForm.getFecha());
       games.add(newgame);

       return "redirect:/juegos/succes";
   }
     
    @GetMapping("/juegos/save")
   public String succes(){

       return "juego/succes";
   }

}

