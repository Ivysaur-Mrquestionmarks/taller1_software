package com.eafit.juego.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class gameControler {

       private static final List<Map<String, String>> games = new ArrayList<>(List.of(
       Map.of("creator", "Juan", "names-teams", "Rojo y verde", "Fecha", "2do de julio", "name", "Primer juego de la primera ronda del torneo"),
       Map.of("creator", "Juan", "names-teams", "azul y amrillo", "Fecha", "3ero de julio", "name", "segundo juego de la primera ronda del torneo"),
       Map.of("creator", "Juan", "names-teams", "Gandoress de la primera y segunda ronda del torneo", "Fecha", "2do de julio", "name", "primer juego de la seugunda ronda del torneo")
   ));
     
}

