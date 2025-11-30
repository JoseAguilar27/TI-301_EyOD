package tarea;

// Fig. 16.13: Algoritmos2.java
// Los métodos addAll, frequency y disjoint de Collections.
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algoritmos2 
{
   public static void main(String[] args) 
   {
      // inicializa lista1 y lista2
      String[] colores = {"rojo", "blanco", "amarillo", "azul"};
      List<String> lista1 = Arrays.asList(colores);
      ArrayList<String> lista2 = new ArrayList<>();

      lista2.add("negro"); // agrega "negro" al final de lista2
      lista2.add("rojo"); // agrega "rojo" al final de lista2
      lista2.add("verde"); // agrega "verde" al final de lista2

      System.out.print("Antes de addAll, lista2 contiene: ");

      // muestra los elementos en lista2
      for (String s : lista2)
         System.out.printf("%s ", s);

      Collections.addAll(lista2, colores); // agrega los objetos String de colores a lista2

      System.out.printf("%nDespues de addAll, lista2 contiene: ");

      // muestra los elementos en lista2
      for (String s : lista2)
         System.out.printf("%s ", s);

      // obtiene la frecuencia de "rojo"
      int frecuencia = Collections.frequency(lista2, "rojo");
      System.out.printf(                                  
         "%nFrecuencia de rojo en lista2: %d%n", frecuencia); 

      // comprueba si lista1 y lista2 tienen elementos en común
      boolean desunion = Collections.disjoint(lista1, lista2); 

      System.out.printf("lista1 y lista2 %s elementos en comun%n", 
         (desunion ? "no tienen" : "tienen"));
   } 
} // fin de la clase Algoritmos2
