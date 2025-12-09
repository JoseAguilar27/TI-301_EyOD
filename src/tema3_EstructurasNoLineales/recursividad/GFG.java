package tema3_EstructurasNoLineales.recursividad;

import java.io.*;
import java.math.*;
import java.util.*;

public class GFG {
    
    //resolver el problema de las Torres de Hanoi
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 0) { //Si no hay discos (n=0), no hacer nada
            return; // Termina esta llamada de la función
        }
        towerOfHanoi(n - 1, from_rod, to_rod, aux_rod); //Mover n-1 discos de la torre origen a la torre auxiliar, usando la torre destino como auxiliar temporal
        System.out.println("move disk " + n + " from rod " + from_rod + " to rod " + to_rod); //Mover el disco más grande (disco n) de origen a destino
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod); //Mover los n-1 discos de la torre auxiliar a la torre destino, usando la torre origen como auxiliar temporal
    }

    public static void main(String[] args) {
        int N = 3; // Número total de discos a mover

        towerOfHanoi(N, 'A', 'C', 'B'); /*Llamar a la función para mover 3 discos:
                                        Desde torre 'A' (origen) hasta torre 'C' (destino)
                                        Usando torre 'B' como apoyo*/
    }
}
