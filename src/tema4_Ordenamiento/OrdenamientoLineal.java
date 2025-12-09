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
public class OrdenamientoLineal {
    public static int busquedaLineal(int[] arr, int target) {
        // Recorremos cada elemento del arreglo uno por uno
        for (int i = 0; i < arr.length; i++) {
            // Comparamos el elemento actual con el target
            if (arr[i] == target) {
                // Si encontramos el elemento, retornamos su índice
                return i;
            }
        }
        // Si llegamos aquí, el elemento no está en el arreglo
        return -1;
    }
    public static String busquedaLinealDetallada(int[] arr, int target) {
        // Caso especial: arreglo vacío
        if (arr.length == 0) {
            return "El arreglo está vacío";
        }
        
        // Caso especial: arreglo muy grande - informamos al usuario
        if (arr.length >= 1000000) {
            System.out.printf("Buscando en un arreglo de %,d elementos...%n", arr.length);
            System.out.println("Esto puede tomar un tiempo con búsqueda lineal...");
        }
        
        // Contador para mostrar progreso (opcional, para arreglos muy grandes)
        int elementosVerificados = 0;
        
        // Búsqueda lineal principal
        for (int i = 0; i < arr.length; i++) {
            elementosVerificados++;
            
            // Mostrar progreso cada 100,000 elementos (solo para arreglos grandes)
            if (arr.length >= 1000000 && elementosVerificados % 100000 == 0) {
                double progreso = (elementosVerificados / (double) arr.length) * 100;
                System.out.printf("Progreso: %.1f%% (%,d elementos verificados)%n", 
                                 progreso, elementosVerificados);
            }
            
            if (arr[i] == target) {
                return String.format("Elemento %d encontrado en el índice %d", target, i);
            }
        }
        
        return String.format("Elemento %d no encontrado en el arreglo", target);
    }
    
    /**
     * Método para crear un arreglo de ejemplo con datos aleatorios
     * 
     * @param tamaño Cantidad de elementos del arreglo
     * @param max Valor máximo para los números aleatorios
     * @return Arreglo de enteros con datos aleatorios
     */
    public static int[] crearArregloAleatorio(int tamaño, int max) {
        int[] arreglo = new int[tamaño];
        Random random = new Random();
        
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = random.nextInt(max) + 1; // Números entre 1 y max
        }
        
        return arreglo;
    }
    
    /**
     * Ejemplo de uso para probar el algoritmo
     */
    public static void ejemploUso() {
        System.out.println("=== EJEMPLO DE BÚSQUEDA LINEAL ===");
        
        // Arreglo de ejemplo (no ordenado)
        int[] arregloEjemplo = {42, 15, 7, 99, 23, 56, 88, 3, 17, 91, 64, 28};
        
        // Elementos a buscar
        int[] elementosABuscar = {56, 100, 3};
        
        // Mostrar el arreglo
        System.out.print("Arreglo: [");
        for (int i = 0; i < arregloEjemplo.length; i++) {
            System.out.print(arregloEjemplo[i]);
            if (i < arregloEjemplo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Realizar búsquedas
        for (int target : elementosABuscar) {
            System.out.printf("%nBuscando el elemento %d...%n", target);
            
            // Usar la versión básica
            int resultado = busquedaLineal(arregloEjemplo, target);
            
            if (resultado != -1) {
                System.out.printf("✓ Encontrado en el índice: %d%n", resultado);
                System.out.printf("  Valor en esa posición: %d%n", arregloEjemplo[resultado]);
            } else {
                System.out.printf("✗ Elemento %d no encontrado%n", target);
            }
        }
    }
    
    /**
     * Simulación con arreglo de 1,000,000 de elementos
     */
    public static void simulacionArregloGrande() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SIMULACIÓN CON 1,000,000 DE ELEMENTOS");
        System.out.println("=".repeat(50));
        
        // Crear un arreglo grande de ejemplo (1,000,000 elementos)
        System.out.println("Creando arreglo de 1,000,000 elementos...");
        int[] arregloGrande = crearArregloAleatorio(1_000_000, 10_000_000);
        
        // Tomar un elemento que sabemos que existe (por ejemplo, el del medio)
        int targetGrande = arregloGrande[500_000];
        System.out.printf("Buscando elemento %d (que sabemos que existe)...%n", targetGrande);
        
        // Medir el tiempo de búsqueda
        long inicio = System.currentTimeMillis();
        String resultado = busquedaLinealDetallada(arregloGrande, targetGrande);
        long fin = System.currentTimeMillis();
        
        double tiempoSegundos = (fin - inicio) / 1000.0;
        System.out.printf("%nResultado: %s%n", resultado);
        System.out.printf("Tiempo de búsqueda: %.3f segundos%n", tiempoSegundos);
        
        // Buscar un elemento que probablemente no existe
        System.out.println("\nBuscando elemento -1 (que probablemente no existe)...");
        inicio = System.currentTimeMillis();
        resultado = busquedaLinealDetallada(arregloGrande, -1);
        fin = System.currentTimeMillis();
        
        tiempoSegundos = (fin - inicio) / 1000.0;
        System.out.printf("%nResultado: %s%n", resultado);
        System.out.printf("Tiempo de búsqueda: %.3f segundos%n", tiempoSegundos);
    }
    
    /**
     * Información sobre el algoritmo
     */
    public static void informacionAlgoritmo() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("INFORMACIÓN SOBRE BÚSQUEDA LINEAL");
        System.out.println("=".repeat(60));
        System.out.println("\nCARACTERÍSTICAS:");
        System.out.println("1. Tipo: Búsqueda secuencial");
        System.out.println("2. Requisito: No necesita arreglo ordenado");
        System.out.println("3. Complejidad temporal: O(n) en el peor caso");
        System.out.println("4. Complejidad espacial: O(1) - memoria constante");
        System.out.println("5. Ventaja: Simple y funciona con datos no ordenados");
        System.out.println("6. Desventaja: Lento para arreglos muy grandes");
        
        System.out.println("\nRECOMENDACIONES:");
        System.out.println("• Para 1,000,000 de elementos no ordenados, es la única opción directa");
        System.out.println("• Si harás muchas búsquedas, considera ordenar primero el arreglo");
        System.out.println("• Para búsquedas repetitivas, usar HashMap es mejor (O(1))");
    }
    
    /**
     * Menú interactivo para probar diferentes casos
     */
    public static void menuInteractivo() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("MENÚ INTERACTIVO DE BÚSQUEDA");
        System.out.println("=".repeat(50));
        
        System.out.print("¿Qué tamaño de arreglo deseas? (ej: 100, 1000, 1000000): ");
        int tamaño = scanner.nextInt();
        
        System.out.print("¿Valor máximo para números aleatorios?: ");
        int max = scanner.nextInt();
        
        // Crear arreglo
        System.out.println("Creando arreglo...");
        int[] arreglo = crearArregloAleatorio(tamaño, max);
        
        if (tamaño <= 20) {
            System.out.print("Arreglo generado: [");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i]);
                if (i < arreglo.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        } else {
            System.out.printf("Arreglo de %,d elementos generado (mostrando primeros 10): [", tamaño);
            for (int i = 0; i < Math.min(10, arreglo.length); i++) {
                System.out.print(arreglo[i]);
                if (i < Math.min(10, arreglo.length) - 1) System.out.print(", ");
            }
            System.out.println("...]");
        }
        
        boolean continuar = true;
        while (continuar) {
            System.out.print("\n¿Qué número deseas buscar? (-1 para salir): ");
            int target = scanner.nextInt();
            
            if (target == -1) {
                continuar = false;
                continue;
            }
            
            // Realizar búsqueda
            long inicio = System.currentTimeMillis();
            int resultado = busquedaLineal(arreglo, target);
            long fin = System.currentTimeMillis();
            
            if (resultado != -1) {
                System.out.printf("✓ Elemento %d encontrado en índice %d%n", target, resultado);
            } else {
                System.out.printf("✗ Elemento %d no encontrado%n", target);
            }
            
            System.out.printf("Tiempo de búsqueda: %d ms%n", (fin - inicio));
        }
        
        scanner.close();
        System.out.println("¡Gracias por usar el buscador!");
    }
}
    
    
    
