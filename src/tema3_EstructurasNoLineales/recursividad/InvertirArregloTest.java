package tema3_EstructurasNoLineales.recursividad;

import tema3_EstructurasNoLineales.recursividad.InvertirArreglo;
import static tema3_EstructurasNoLineales.recursividad.InvertirArreglo.reverseArray;

public class InvertirArregloTest {

    public static void main(String[] args) {
        //imprimir arreglo normal
        int[] array1 = {1, 2, 3, 4, 5, 6}; //areglo para ejemplo 1
        System.out.print(" arreglo normal ");
        imprimir(array1); //imprime el arreglo es su forma original
        //imprimir arreglo invertido
        InvertirArreglo.reverseArray(array1, 0, array1.length - 1); //llama al metodo que invierte los arreglos 
        System.out.print(" arreglo invertido ");
        imprimir(array1); // llama de nuevo al arreglo pero ya cuando se ha invertido
        //imprimir arreglo 2 normal
        int[] array2 = {10, 20, 30, 40, 50, 60, 70, 80, 90}; //areglo para ejemplo 2
        System.out.print(" arreglo normal ");
        imprimir(array2);
        //imprimir arreglo 2 invertido
        InvertirArreglo.reverseArray(array2, 0, array2.length - 1);
        System.out.print(" arreglo invertido ");
        imprimir(array2);
        //imprimir arreglo 3 normal
        int[] array3 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000}; //areglo para ejemplo 3
        System.out.print(" arreglo normal ");
        imprimir(array3);
        //imprimir arreglo 3 invertido
        InvertirArreglo.reverseArray(array3, 0, array3.length - 1);
        System.out.print(" arreglo invertido ");
        imprimir(array3);
    }
    //metodo para imprimir cada arreglo
    public static void imprimir(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
