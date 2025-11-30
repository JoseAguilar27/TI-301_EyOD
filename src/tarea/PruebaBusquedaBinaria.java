package tarea;

// Fig. 16.12: PruebaBusquedaBinaria.java
// El método binarySearch de Collections.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class PruebaBusquedaBinaria 
{
   public static void main(String[] args)
   {
      // crea un ArrayList<String> a partir del contenido del arreglo colores
      String[] colores = {"rojo", "blanco", "azul", "negro", "amarillo", 
         "purple", "tan", "pink"};
      List<String> lista = 
         new ArrayList<>(Arrays.asList(colores));

      Collections.sort(lista); // ordena el objeto ArrayList
      System.out.printf("ArrayList ordenado: %s%n", lista);

      // busca varios valores en la lista
      imprimirResultadosBusqueda(lista, "negro"); // primer elemento
      imprimirResultadosBusqueda(lista, "rojo"); // elemento medio
      imprimirResultadosBusqueda(lista, "rosa"); // último elemento
      imprimirResultadosBusqueda(lista, "aqua"); // debajo del menor
      imprimirResultadosBusqueda(lista, "gris"); // no existe
      imprimirResultadosBusqueda(lista, "verdeazulado"); // no existe
   }      

   // realiza búsqueda y muestra el resultado
   private static void imprimirResultadosBusqueda(
      List<String> lista, String clave)
   {
      int resultado = 0;

      System.out.printf("%nBuscando: %s%n", clave);
      resultado = Collections.binarySearch(lista, clave);
      
      if (resultado >= 0)
         System.out.printf("Se encontro en el indice %d%n", resultado);
      else
         System.out.printf("No se encontro (%d)%n",resultado);
   } 
} // fin de la clase PruebaBusquedaBinaria
