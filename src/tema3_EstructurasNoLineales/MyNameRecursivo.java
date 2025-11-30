/*
* ITESS-TICS 2025 Estructura y Organizacion de Datos
* Periodo: Agosto Diciembre 2025
* Docente: Francisco Javier Montecillo Puente
*Tema 2. Estructuras Lineales
      2.1 Lista
* Descripcion: Dado un arreglo encontrar si hay numeros repetidos
              un objetivo. i.e. [1 2 3 1] true
                           i.e. [3 4 5 6] false
* Programador: JEAA
* Email: ti24110122@itess.edu.mx --- aguilaralvezjoseemanuel@gmail.com
* Fecha: 17/Octubre/2025

 */
package tema3_EstructurasNoLineales;

public class MyNameRecursivo {

    public static int count = 0;

    public static void main(String[] args) {
        printName(5, "FJMP");
    }

    public static void printName(int n, String name) {
        if (count > n) {
            count = 0;
            return;
        }
        System.out.println(count + ":" + name);
        count++;
        printName(n, name);
        
    }
}
