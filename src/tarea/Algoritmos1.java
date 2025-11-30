package tarea;

// Fig. 16.11: Algoritmos1.java
// Los métodos reverse, fill, copy, max y min de Collections.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algoritmos1 
{
   public static void main(String[] args)
   {
      // crea y muestra un objeto List<Character>
      Character[] letras = {'P', 'C', 'M'};
      List<Character> lista = Arrays.asList(letras); // obtiene el objeto List
      System.out.println("lista contiene: ");
      imprimir(lista);

      // invierte y muestra el objeto List<Character>
      Collections.reverse(lista); // invierte el orden de los elementos
      System.out.printf("%nDespues de llamar a reverse, lista contiene:%n");
      imprimir(lista);

      // crea copiaLista a partir de un arreglo de 3 objetos Character
      Character[] letrasCopia = new Character[3]; 
      List<Character> copiaLista = Arrays.asList(letrasCopia); 

      // copia el contenido de lista a copiaLista
      Collections.copy(copiaLista, lista);
      System.out.printf("%nDespues de copiar, copiaLista contiene:%n");
      imprimir(copiaLista);

      // llena la lista con letras R 
      Collections.fill(lista, 'R');
      System.out.printf("%nDespues de llamar a fill, lista contiene:%n");
      imprimir(lista);
   }

   // imprime la información del objeto List
   private static void imprimir(List<Character> refLista)
   {
      System.out.print("La lista es: ");

      for (Character elemento : refLista)
         System.out.printf("%s ", elemento);

      System.out.printf("%nMax: %s", Collections.max(refLista));
      System.out.printf("  Min: %s%n", Collections.min(refLista));
   } 
} // fin de la clase Algoritmos1
