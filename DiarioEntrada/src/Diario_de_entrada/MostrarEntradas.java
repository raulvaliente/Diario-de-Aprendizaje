package Diario_de_entrada;

import java.io.*; 
import java.util.ArrayList; 
import java.util.List; 
 
public class MostrarEntradas { 
   public static void mostrar(String nombreArchivo) { 
       try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) { 
           String linea; 
           System.out.println("===== TUS ENTRADAS ====="); 
           while ((linea = reader.readLine()) != null) { 
               System.out.println(linea); 
           } 
       } catch (FileNotFoundException e) { 
           System.out.println("No hay entradas todavía."); 
       } catch (IOException e) { 
           System.out.println("Error al leer el archivo."); 
       } 
   } 
} 
