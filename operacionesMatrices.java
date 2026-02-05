import java.util.Scanner;

public class operacionesMatrices {

    public static void main(String[] args) {
        
        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[2][3];

        System.out.println("Ingreso de datos Matriz A:");
        completarMatrices(matrizA);
        
        System.out.println("\nIngreso de datos Matriz B:");
        completarMatrices(matrizB);

        System.out.println("\nRESULTADOS: ");

        System.out.println("\nSuma de A + B:");
        mostrarResultado(sumaMatriz(matrizA, matrizB));

        System.out.println("\nResta de A - B:");
        mostrarResultado(restaMatriz(matrizA, matrizB));

        System.out.println("\nMultiplicación (Elemento por elemento):");
        mostrarResultado(multiplicacionMatriz(matrizA, matrizB));
    }

    
    public static void completarMatrices(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] sumaMatriz(int[][] a, int[][] b) {
        int[][] resultado = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }

    public static int[][] restaMatriz(int[][] a, int[][] b) {
        int[][] resultado = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = a[i][j] - b[i][j];
            }
        }
        return resultado;
    }

    public static int[][] multiplicacionMatriz(int[][] a, int[][] b) {
        int[][] resultado = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                
                resultado[i][j] = a[i][j] * b[i][j];
            }
        }
        return resultado;
    }

    public static void mostrarResultado(int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}