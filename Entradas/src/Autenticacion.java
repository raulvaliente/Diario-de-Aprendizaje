import java.io.*; 

 
public class Autenticacion { 
   private static final String ARCHIVO_USUARIOS = "usuarios.txt"; 
 
   public static boolean registrar(String email, String contrasena) { 
       try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_USUARIOS, true))) { 
           writer.write(email + ":" + contrasena); 
           writer.newLine(); 
           System.out.println("Usuario registrado correctamente."); 
           return true; 
       } catch (IOException e) { 
           System.out.println("Error al registrar el usuario."); 
           return false; 
       } 
   } 
 
   public static boolean login(String email, String contrasena) { 
       try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_USUARIOS))) { 
           String linea; 
           while ((linea = reader.readLine()) != null) { 
               String[] partes = linea.split(":"); 
               if (partes[0].equals(email) && partes[1].equals(contrasena)) { 
                   System.out.println("Login correcto. Bienvenido, " + email); 
                   return true; 
               } 
           } 
       } catch (FileNotFoundException e) { 
           System.out.println("No hay usuarios registrados todavía."); 
       } catch (IOException e) { 
           System.out.println("Error al leer usuarios."); 
       } 
       System.out.println("Email/contraseña incorrectos."); 
       return false; 
   } 
} 