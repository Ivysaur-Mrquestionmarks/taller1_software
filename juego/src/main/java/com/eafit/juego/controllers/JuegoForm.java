package com.eafit.juego.controllers;

import java.sql.Date;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class JuegoForm {
   @NotEmpty(message = "El nombre del juego es requerido")
   private String name;

   @NotEmpty(message = "El nombre del creador es requerido")
   private String creator;

   @NotEmpty(message = "El nombre de lso equipos es requerido")
   private String teams;   

   @NotNull(message = "La fecha es requerida")
   private Date fecha;

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getCreator() {
       return creator;
   }

   public void setCreator(String creator) {
       this.creator = creator;
   }   

    public String getTeams() {
       return teams;
   }

   public void setTeams(String teams) {
       this.teams = teams;
   } 

    public Date getFecha() {
       return fecha;
   }

   public void setFecha (Date fecha) {
       this.fecha = fecha;
   }    


}
