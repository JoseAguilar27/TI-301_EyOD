package tema3_EstructurasNoLineales.recursividad;

import tema3_EstructurasNoLineales.recursividad.RecursionBinaria;

public class RecursionBinariaTest {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6}; //arreglo para el ejemplo
        int resultado = RecursionBinaria.binarySum(array1, 0, array1.length - 1); //Se llama el metodo binarysum, el cual suma los numeros dentro del arreglo ejemplo(1+2+3+4+5+6)
        System.out.println(" suma " + resultado); //se imprime el resultado
       
        int[] array2 = {2, 4, 6, 8, 10, 12, 14};
        int resultado2 = RecursionBinaria.binarySum(array2, 0, array2.length - 1);
        System.out.println(" suma " + resultado2);
        
        int[] array3 = {11, 22, 33, 44, 55, 66};
        int resultado3 = RecursionBinaria.binarySum(array3, 0, array3.length - 1);
        System.out.println(" suma " + resultado3);
    }
}
