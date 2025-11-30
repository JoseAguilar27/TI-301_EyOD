package tarea;

// Fig. 16.16: PruebaSet.java
// Uso de un objeto HashSet para eliminar valores duplicados de un arreglo de cadenas.
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class PruebaSet 
{
   public static void main(String[] args)
   {
      // crea y muestra un objeto List<String>
      String[] colores = {"rojo", "blanco", "azul", "verde", "gris", 
         "naranja", "carne", "blanco", "cyan", "durazno", "gris", "naranja"};
      List<String> lista = Arrays.asList(colores);
      System.out.printf("List: %s%n", lista);

      // elimina duplicados y luego imprime los valores únicos
      imprimirSinDuplicados(lista);
   }  

   // crea un objeto Set a partir de un objeto Collection para eliminar duplicados
   private static void imprimirSinDuplicados(Collection<String> valores)
   {
      // crea un objeto HashSet 
      Set<String> conjunto = new HashSet<>(valores);

      System.out.printf("%nLos valores sin duplicados son: ");

      for (String valor : conjunto)
         System.out.printf("%s ", valor);

      System.out.println();
   } 
} // fin de la clase PruebaSet
