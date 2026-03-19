import java.io.*; 
import java.time.LocalDate; 
 
public class GuardarEntradas { 
   private static final String ARCHIVO_ENTRADAS = "entradas.txt"; 
 
   public static void guardar(DiarioEntrada entrada) { 
       try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_ENTRADAS, true))) { 
           writer.write("---ENTRADA---"); 
           writer.newLine(); 
           writer.write("Fecha: " + entrada.getFecha()); 
           writer.newLine(); 
           writer.write("Aprendido: " + entrada.getAprendido()); 
           writer.newLine(); 
           writer.write("Realizado: " + entrada.getRealizado()); 
           writer.newLine(); 
           writer.write("Dificultades: " + entrada.getDificultades()); 
           writer.newLine(); 
           writer.write("Herramientas: " + entrada.getHerramientas()); 
           writer.newLine(); 
           System.out.println("Entrada guardada correctamente."); 
       } catch (IOException e) { 
           System.out.println("Error al guardar la entrada."); 
       } 
   } 
} 