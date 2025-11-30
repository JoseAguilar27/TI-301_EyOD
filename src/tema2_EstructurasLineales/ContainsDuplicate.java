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
package tema2_EstructurasLineales;

import java.util.ArrayList;
import java.util.List;

public class ContainsDuplicate {

    public static void main(String[] args) {
        //datos
        //algoritmos para resolver
        int n=10;//rango de numeros desde 0.... n-1
        int N=10;
        List<Integer> nums=generateNums(n,N);
        print(nums);
        System.out.println("ContainsDuplicate" + containsDuplicate(nums));
    }

    public static void print(List<Integer> nums) {
        System.out.println(nums.toString());
    }

    public static List<Integer> generateNums(int n, int N) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums.add((int) (Math.random() * N));
        }
        return nums;
    }

    public static boolean containsDuplicate(List<Integer> nums) {
        for (int i = 0; i <= nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) == nums.get(j)) {
                    return true;
                }
            }
        }
        return false;

    }
}
