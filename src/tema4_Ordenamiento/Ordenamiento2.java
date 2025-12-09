/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4_Ordenamiento;

import java.util.Random;

/**
 *
 * @author Jose
 */
public class Ordenamiento2 {

    public class OrdenamientoQuickSortMillon {

        /**
         * Método principal de QuickSort que implementa el algoritmo
         *
         * @param arreglo El arreglo a ordenar
         * @param inicio Índice inicial
         * @param fin Índice final
         */
        public static void quickSort(int[] arreglo, int inicio, int fin) {
            if (inicio < fin) {
                // Particionar el arreglo y obtener el índice del pivote
                int indicePivote = particionar(arreglo, inicio, fin);

                // Ordenar recursivamente los subarreglos
                quickSort(arreglo, inicio, indicePivote - 1);
                quickSort(arreglo, indicePivote + 1, fin);
            }
        }

        /**
         * Método para particionar el arreglo alrededor de un pivote
         *
         * @param arreglo El arreglo a particionar
         * @param inicio Índice inicial
         * @param fin Índice final
         * @return Índice final del pivote
         */
        private static int particionar(int[] arreglo, int inicio, int fin) {
            int pivote = arreglo[fin];  // Elegir el último elemento como pivote
            int i = inicio - 1;  // Índice del elemento más pequeño

            for (int j = inicio; j < fin; j++) {
                // Si el elemento actual es menor o igual al pivote
                if (arreglo[j] <= pivote) {
                    i++;

                    // Intercambiar arreglo[i] y arreglo[j]
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }

            // Intercambiar arreglo[i+1] y arreglo[fin] (pivote)
            int temp = arreglo[i + 1];
            arreglo[i + 1] = arreglo[fin];
            arreglo[fin] = temp;

            return i + 1;
        }

        /**
         * Versión optimizada de QuickSort con selección del pivote aleatoria
         *
         * @param arreglo El arreglo a ordenar
         * @param inicio Índice inicial
         * @param fin Índice final
         */
        public static void quickSortOptimizado(int[] arreglo, int inicio, int fin) {
            if (inicio < fin) {
                // Seleccionar pivote aleatorio para evitar el peor caso O(n²)
                int indicePivoteAleatorio = inicio + new Random().nextInt(fin - inicio + 1);

                // Mover el pivote aleatorio al final
                int temp = arreglo[indicePivoteAleatorio];
                arreglo[indicePivoteAleatorio] = arreglo[fin];
                arreglo[fin] = temp;

                int indicePivote = particionar(arreglo, inicio, fin);

                // Mostrar progreso (menos frecuente que en burbuja)
                if ((fin - inicio) > 100000 && (fin - inicio) % 100000 == 0) {
                    System.out.println("Procesando subarreglo de tamaño: " + (fin - inicio + 1));
                }

                quickSortOptimizado(arreglo, inicio, indicePivote - 1);
                quickSortOptimizado(arreglo, indicePivote + 1, fin);
            }
        }

        /**
         * Método para generar un arreglo con números aleatorios
         *
         * @param tamaño Tamaño del arreglo
         * @param min Valor mínimo
         * @param max Valor máximo
         * @return Arreglo con números aleatorios
         */
        public static int[] generarArregloAleatorio(int tamaño, int min, int max) {
            int[] arreglo = new int[tamaño];
            Random random = new Random();

            for (int i = 0; i < tamaño; i++) {
                arreglo[i] = random.nextInt(max - min + 1) + min;
            }

            return arreglo;
        }

        /**
         * Método para imprimir los primeros y últimos elementos de un arreglo
         *
         * @param arreglo El arreglo a mostrar
         * @param cantidad Cantidad de elementos a mostrar al inicio y al final
         */
        public static void mostrarArregloLimitado(int[] arreglo, int cantidad) {
            System.out.println("Primeros " + cantidad + " elementos:");
            for (int i = 0; i < Math.min(cantidad, arreglo.length); i++) {
                System.out.print(arreglo[i] + " ");
            }

            System.out.println("\n\nÚltimos " + cantidad + " elementos:");
            for (int i = Math.max(0, arreglo.length - cantidad); i < arreglo.length; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        }

        /**
         * Método para verificar si un arreglo está ordenado
         *
         * @param arreglo El arreglo a verificar
         * @return true si está ordenado, false en caso contrario
         */
        public static boolean estaOrdenado(int[] arreglo) {
            for (int i = 0; i < arreglo.length - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    return false;
                }
            }
            return true;
        }

        /**
         * Método de ordenamiento por inserción para subarreglos pequeños
         *
         * @param arreglo El arreglo a ordenar
         * @param inicio Índice inicial
         * @param fin Índice final
         */
        private static void insertionSort(int[] arreglo, int inicio, int fin) {
            for (int i = inicio + 1; i <= fin; i++) {
                int clave = arreglo[i];
                int j = i - 1;

                while (j >= inicio && arreglo[j] > clave) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                }
                arreglo[j + 1] = clave;
            }
        }

        /**
         * QuickSort híbrido que usa InsertionSort para subarreglos pequeños
         *
         * @param arreglo El arreglo a ordenar
         * @param inicio Índice inicial
         * @param fin Índice final
         * @param umbralInsertionSort Tamaño mínimo para usar InsertionSort
         */
        public static void quickSortHibrido(int[] arreglo, int inicio, int fin, int umbralInsertionSort) {
            if (inicio < fin) {
                // Si el subarreglo es pequeño, usar InsertionSort
                if (fin - inicio < umbralInsertionSort) {
                    insertionSort(arreglo, inicio, fin);
                    return;
                }

                // Seleccionar pivote aleatorio
                int indicePivoteAleatorio = inicio + new Random().nextInt(fin - inicio + 1);
                int temp = arreglo[indicePivoteAleatorio];
                arreglo[indicePivoteAleatorio] = arreglo[fin];
                arreglo[fin] = temp;

                int indicePivote = particionar(arreglo, inicio, fin);

                quickSortHibrido(arreglo, inicio, indicePivote - 1, umbralInsertionSort);
                quickSortHibrido(arreglo, indicePivote + 1, fin, umbralInsertionSort);
            }
        }
    }
}
