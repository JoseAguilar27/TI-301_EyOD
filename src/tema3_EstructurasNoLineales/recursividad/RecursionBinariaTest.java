package tema3_EstructurasNoLineales.recursividad;

import tema3_EstructurasNoLineales.recursividad.RecursionBinaria;

public class RecursionBinariaTest {

    public static void main(String[] args) {
        System.out.println("///EJEMPLO 1///");
        int[] array1 = {1, 2, 3, 4, 5, 6}; //arreglo para el ejemplo
        System.out.print(" arreglo ");
        imprimir(array1);
        int resultado = RecursionBinaria.binarySum(array1, 0, array1.length - 1); //Se llama el metodo binarysum, el cual suma los numeros dentro del arreglo ejemplo(1+2+3+4+5+6)
        System.out.println(" suma " + resultado); //se imprime el resultado

        System.out.println("///EJEMPLO 2///");
        int[] array2 = {2, 4, 6, 8, 10, 12, 14};
        System.out.print(" arreglo ");
        imprimir(array2);
        int resultado2 = RecursionBinaria.binarySum(array2, 0, array2.length - 1);
        System.out.println(" suma " + resultado2);

        System.out.println("///EJEMPLO 3///");
        int[] array3 = {11, 22, 33, 44, 55, 66};
        System.out.print(" arreglo ");
        imprimir(array3);
        int resultado3 = RecursionBinaria.binarySum(array3, 0, array3.length - 1);
        System.out.println(" suma " + resultado3);
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
