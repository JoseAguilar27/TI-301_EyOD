/*
* ITESS-TICS 2025 Estructura y Organizacion de Datos
* Periodo: Agosto Diciembre 2025
* Docente: Francisco Javier Montecillo Puente
*Tema 3. Estructuras no Lineales
        Adjacency List for a Tree
* Programador: JEAA
* Email: ti24110122@itess.edu.mx --- aguilaralvezjoseemanuel@gmail.com
* Fecha: 26/Noviembre/2025

 */
package tema3_EstructurasNoLineales;

import java.util.Scanner;

public class GraphAdjacencyListTest {

    public static void main(String[] args) {
        long inicio = System.nanoTime(); //creas una variable para iniciar con el contador de tipo long (entero grande) la cual ejecutara el metodo nanoTime
        GraphAdjacencyList tree = new GraphAdjacencyList(7);

        tree.addEdge(0, 1);
        tree.addEdge(0, 2);
        tree.addEdge(1, 3);
        tree.addEdge(1, 4);
        tree.addEdge(2, 5);
        tree.addEdge(2, 6);

        tree.print();
        System.out.println("depth(5)" + tree.depth(5));
        long fin = System.nanoTime(); // al igual que con el inicio se crea una para finalizar el contador e igualmente se llama al metodo nanoTime

        long duracionNs = fin - inicio; // mediante esta operacion se obtiene la duracion en nano segundos
        double duracionS = duracionNs / 1_000_000_000.0;
        /* para volverlos segundos, se debe dividir la variable con el resultado en nano segundos entre mil millones 
       y para mas exactitud se crea la variable en double (decimales grandes) y es por eso que al final del numero se agrega el .0*/
        System.out.println(duracionNs + "nano segundos");// se imprime la duracion en nano segundos la cual aperecera en la consola
        System.out.println(duracionS + "segundos"); // se imprime la duracion en segundos la cual aperecera en la consola
    }
}
