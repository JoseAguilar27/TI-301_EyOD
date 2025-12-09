/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4_Ordenamiento;

import static tema4_Ordenamiento.Ordenamiento2.OrdenamientoQuickSortMillon.quickSort;
import static tema4_Ordenamiento.Ordenamiento2.OrdenamientoQuickSortMillon.quickSortHibrido;
import static tema4_Ordenamiento.Ordenamiento2.OrdenamientoQuickSortMillon.quickSortOptimizado;
import static tema4_Ordenamiento.OrdenamientoBurbuja.OrdenamientoBurbujaMillon.estaOrdenado;
import static tema4_Ordenamiento.OrdenamientoBurbuja.OrdenamientoBurbujaMillon.generarArregloAleatorio;
import static tema4_Ordenamiento.OrdenamientoBurbuja.OrdenamientoBurbujaMillon.mostrarArregloLimitado;

/**
 *
 * @author Jose
 */
public class Ordenamiento2Test {
    public static void main(String[] args) {
        final int TAMANO = 1000000;  // Un millón de elementos
        final int ELEMENTOS_A_MOSTRAR = 10;
        
        System.out.println("=== ORDENAMIENTO QUICKSORT CON 1,000,000 DE DATOS ===");
        System.out.println("Generando " + TAMANO + " números aleatorios...");
        
        // Generar arreglo aleatorio
        long inicioGeneracion = System.currentTimeMillis();
        int[] numeros = generarArregloAleatorio(TAMANO, 1, 1000000);
        long finGeneracion = System.currentTimeMillis();
        
        System.out.println("Generación completada en " + (finGeneracion - inicioGeneracion) + " ms");
        
        // Hacer copias para comparar diferentes versiones
        int[] copia1 = numeros.clone();
        int[] copia2 = numeros.clone();
        int[] copia3 = numeros.clone();
        
        System.out.println("\n--- ANTES DE ORDENAR ---");
        mostrarArregloLimitado(copia1, ELEMENTOS_A_MOSTRAR);
        
        // 1. QuickSort básico
        System.out.println("\n\n=== PRUEBA 1: QUICKSORT BÁSICO ===");
        long inicioQS1 = System.currentTimeMillis();
        quickSort(copia1, 0, copia1.length - 1);
        long finQS1 = System.currentTimeMillis();
        long tiempoQS1 = finQS1 - inicioQS1;
        boolean ordenado1 = estaOrdenado(copia1);
        
        System.out.println("Tiempo QuickSort básico: " + tiempoQS1 + " ms");
        System.out.println("¿Ordenado correctamente? " + (ordenado1 ? "SÍ" : "NO"));
        
        // 2. QuickSort optimizado (pivote aleatorio)
        System.out.println("\n=== PRUEBA 2: QUICKSORT OPTIMIZADO ===");
        System.out.println("Iniciando ordenamiento con pivote aleatorio...");
        
        long inicioQS2 = System.currentTimeMillis();
        quickSortOptimizado(copia2, 0, copia2.length - 1);
        long finQS2 = System.currentTimeMillis();
        long tiempoQS2 = finQS2 - inicioQS2;
        boolean ordenado2 = estaOrdenado(copia2);
        
        System.out.println("Tiempo QuickSort optimizado: " + tiempoQS2 + " ms");
        System.out.println("¿Ordenado correctamente? " + (ordenado2 ? "SÍ" : "NO"));
        
        // 3. QuickSort híbrido
        System.out.println("\n=== PRUEBA 3: QUICKSORT HÍBRIDO ===");
        System.out.println("Iniciando ordenamiento híbrido (QuickSort + InsertionSort)...");
        
        long inicioQS3 = System.currentTimeMillis();
        quickSortHibrido(copia3, 0, copia3.length - 1, 10);
        long finQS3 = System.currentTimeMillis();
        long tiempoQS3 = finQS3 - inicioQS3;
        boolean ordenado3 = estaOrdenado(copia3);
        
        System.out.println("Tiempo QuickSort híbrido: " + tiempoQS3 + " ms");
        System.out.println("¿Ordenado correctamente? " + (ordenado3 ? "SÍ" : "NO"));
        
        System.out.println("\n--- RESUMEN DE RESULTADOS ---");
        System.out.println("1. QuickSort básico: " + tiempoQS1 + " ms");
        System.out.println("2. QuickSort optimizado: " + tiempoQS2 + " ms");
        System.out.println("3. QuickSort híbrido: " + tiempoQS3 + " ms");
        
        // Mostrar resultados del mejor algoritmo
        System.out.println("\n--- DESPUÉS DE ORDENAR (usando versión optimizada) ---");
        mostrarArregloLimitado(copia2, ELEMENTOS_A_MOSTRAR);
        
        // Comparación con Bubble Sort (solo para referencia)
        System.out.println("\n\n=== COMPARACIÓN CON BUBBLE SORT ===");
        System.out.println("Para 1,000,000 de elementos:");
        System.out.println("- QuickSort: ~" + tiempoQS2 + " ms (~" + (tiempoQS2/1000.0) + " segundos)");
        System.out.println("- Bubble Sort: ~" + (TAMANO * TAMANO / 1000000) + " segundos estimados");
        System.out.println("  (aproximadamente 16.5 minutos para el peor caso)");
        
        // Prueba con arreglo ya ordenado (mejor caso para QuickSort)
        System.out.println("\n=== PRUEBA CON ARREGLO YA ORDENADO ===");
        int[] arregloOrdenado = new int[10000];
        for (int i = 0; i < arregloOrdenado.length; i++) {
            arregloOrdenado[i] = i;
        }
        
        long inicioMejorCaso = System.currentTimeMillis();
        quickSortOptimizado(arregloOrdenado, 0, arregloOrdenado.length - 1);
        long finMejorCaso = System.currentTimeMillis();
        
        System.out.println("Tiempo para arreglo ya ordenado (10,000 elementos): " + 
                          (finMejorCaso - inicioMejorCaso) + " ms");
    }
}

