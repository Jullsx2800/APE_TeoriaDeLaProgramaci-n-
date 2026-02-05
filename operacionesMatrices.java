import java.util.Scanner;

public class operacionesMatrices {

    // Se declara el Scanner como estático para poder usarlo en todos los métodos 
    // y cerrarlo una sola vez al final del programa sin cortar el flujo de entrada.
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // 1. Declaración e inicialización de matrices de 2 filas por 3 columnas
        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[2][3];

        // 2. Llamada al método para llenar la primera matriz (A)
        System.out.println("Ingreso de datos Matriz A:");
        completarMatrices(matrizA);
        
        // 3. Llamada al método para llenar la segunda matriz (B)
        System.out.println("\nIngreso de datos Matriz B:");
        completarMatrices(matrizB);

        System.out.println("\nRESULTADOS: ");

        // 4. Mostrar suma: Se llama a sumaMatriz y su resultado se pasa a mostrarResultado
        System.out.println("\nSuma de A + B:");
        mostrarResultado(sumaMatriz(matrizA, matrizB));

        // 5. Mostrar resta
        System.out.println("\nResta de A - B:");
        mostrarResultado(restaMatriz(matrizA, matrizB));

        // 6. Mostrar multiplicación
        System.out.println("\nMultiplicación (Elemento por elemento):");
        mostrarResultado(multiplicacionMatriz(matrizA, matrizB));
        
        // CIERRE DEL SCANNER
        scanner.close();
    }

    
    // Método para rellenar una matriz con datos del usuario
    public static void completarMatrices(int[][] matriz) {
        // Bucle externo: recorre las filas (i)
        for (int i = 0; i < 2; i++) { 
            // Bucle interno: recorre las columnas (j) por cada fila
            for (int j = 0; j < 3; j++) { 
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                // Asigna el valor ingresado a la posición específica [i][j]
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método que suma dos matrices y devuelve una nueva matriz con el resultado
    public static int[][] sumaMatriz(int[][] a, int[][] b) {
        int[][] resultado = new int[2][3]; // Matriz temporal para guardar la suma
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                // Suma el valor de A con el valor de B en la misma posición
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado; // Retorna la matriz llena
    }

    // Método que resta dos matrices
    public static int[][] restaMatriz(int[][] a, int[][] b) {
        int[][] resultado = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                // Resta el valor de B al de A en la misma posición
                resultado[i][j] = a[i][j] - b[i][j];
            }
        }
        return resultado;
    }

    // Método de multiplicación 
    public static int[][] multiplicacionMatriz(int[][] a, int[][] b) {
        int[][] resultado = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                // Multiplica los valores de la misma posición
                resultado[i][j] = a[i][j] * b[i][j];
            }
        }
        return resultado;
    }

    // Método auxiliar para imprimir cualquier matriz de 2x3 en consola
    public static void mostrarResultado(int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            System.out.print("[ "); // Decoración de inicio de fila
            for (int j = 0; j < 3; j++) {
                // Imprime el valor seguido de un espacio
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]"); // Salto de línea al terminar la fila
        }
    }
}