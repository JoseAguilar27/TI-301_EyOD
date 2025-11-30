package tarea;

// Fig. 16.19: PruebaProperties.java
// Demuestra la clase Properties del paquete java.util.
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PruebaProperties  
{
   public static void main(String[] args)
   {
      Properties tabla = new Properties();

      // establece las propiedades                  
      tabla.setProperty("color", "azul");
      tabla.setProperty("anchura", "200"); 

      System.out.println("Despues de establecer propiedades");
      listarPropiedades(tabla); 

      // reemplaza el valor de una propiedad
      tabla.setProperty("color", "rojo");

      System.out.println("Despues de reemplazar propiedades");
      listarPropiedades(tabla); 

      guardarPropiedades(tabla);

      tabla.clear(); // vacía la tabla

      System.out.println("Despues de borrar propiedades");
      listarPropiedades(tabla);
      
      cargarPropiedades(tabla); 

      // obtiene el valor de la propiedad color
      Object valor = tabla.getProperty("color");

      // comprueba si el valor está en la tabla
      if (valor != null)
         System.out.printf("El valor de la propiedad color es %s%n", valor);
      else
         System.out.println("La propiedad color no está en la tabla");
   } 

   // guarda las propiedades en un archivo
   private static void guardarPropiedades(Properties props)
   {
      // guarda el contenido de la tabla
      try
      {
         FileOutputStream salida = new FileOutputStream("props.dat");
         props.store(salida, "Propiedades de ejemplo"); // guarda las propiedades
         salida.close();
         System.out.println("Despues de guardar las propiedades");
         listarPropiedades(props); 
      } 
      catch (IOException ioException)
      {
         ioException.printStackTrace();
      } 
   } 

   // carga las propiedades de un archivo
   private static void cargarPropiedades(Properties props)
   {
      // carga el contenido de la tabla
      try
      {
         FileInputStream entrada = new FileInputStream("props.dat");
         props.load(entrada); // carga las propiedades
         entrada.close();
         System.out.println("Despues de cargar las propiedades");
         listarPropiedades(props); 
      } 
      catch (IOException ioException)
      {
         ioException.printStackTrace();
      } 
   } 

   // imprime los valores de las propiedades
   private static void listarPropiedades(Properties props)
   {
      Set<Object> claves = props.keySet(); // obtiene los nombres de las propiedades
  
      // imprime los pares nombre/valor
      for (Object clave : claves)
         System.out.printf(
            "%s\t%s%n", clave, props.getProperty((String) clave));

      System.out.println();
   } 
} // fin de la clase PruebaProperties