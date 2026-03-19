package Diario_de_entrada;

import java.time.LocalDate; 

public class DiarioEntrada { 
   private LocalDate fecha; 
   private String aprendido; 
   private String realizado; 
   private String dificultades; 
   private String herramientas; 
 
  
   public DiarioEntrada(LocalDate fecha, String aprendido, String realizado, 
                        String dificultades, String herramientas) { 
       this.fecha = fecha; 
       this.aprendido = aprendido; 
       this.realizado = realizado; 
       this.dificultades = dificultades; 
       this.herramientas = herramientas; 
   } 
 

   public LocalDate getFecha() { return fecha; } 
   public String getAprendido() { return aprendido; } 
   public String getRealizado() { return realizado; } 
   public String getDificultades() { return dificultades; } 
   public String getHerramientas() { return herramientas; } 
 
   public void setFecha(LocalDate fecha) { this.fecha = fecha; } 
   public void setAprendido(String aprendido) { this.aprendido = aprendido; } 
   public void setRealizado(String realizado) { this.realizado = realizado; } 
   public void setDificultades(String dificultades) { this.dificultades = dificultades; } 
   public void setHerramientas(String herramientas) { this.herramientas = herramientas; } 
 
   @Override 
   public String toString() { 
       return "Fecha: " + fecha + "\nAprendido: " + aprendido + 
              "\nRealizado: " + realizado + "\nDificultades: " + dificultades + 
              "\nHerramientas: " + herramientas; 
   } 
} 
