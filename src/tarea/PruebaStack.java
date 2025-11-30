package tarea;

// Fig. 16.14: PruebaStack.java
// La clase Stack del paquete java.util.
import java.util.Stack;              
import java.util.EmptyStackException;

public class PruebaStack 
{
   public static void main(String[] args)
   {
      Stack<Number> pila = new Stack<>(); // crea un objeto Stack

      // usa el método push
      pila.push(12L); // mete el valor long 12L
      System.out.println("Se metio 12L");
      imprimirPila(pila);
      pila.push(34567); // mete el valor int 34567
      System.out.println("Se metio 34567");
      imprimirPila(pila);
      pila.push(1.0F); // mete el valor float 1.0F
      System.out.println("Se metio 1.0F");
      imprimirPila(pila);
      pila.push(1234.5678); // mete el valor double 1234.5678
      System.out.println("Se metio 1234.5678 ");
      imprimirPila(pila);

      // elimina los elementos de la pila
      try 
      {
         Number objetoEliminado = null;

         // saca elementos de la pila
         while (true) 
         {
            objetoEliminado = pila.pop(); // usa el método pop
            System.out.printf("Se saco %s%n", objetoEliminado);
            imprimirPila(pila);
         } 
      } 
      catch (EmptyStackException emptyStackException) 
      {
         emptyStackException.printStackTrace();
      } 
   } 

   // muestra el contenido de Pila
   private static void imprimirPila(Stack<Number> pila)
   {
      if (pila.isEmpty())
         System.out.printf("la pila esta vacia%n%n"); // la pila está vacía
      else // la pila no está vacía
         System.out.printf("la pila contiene: %s (cima)%n", pila);      
   }    
} // fin de la clase PruebaStack
