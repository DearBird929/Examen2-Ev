/* Hacer un programa que multiplique 2 matrices. Nota matemática, dos matrices A y B son multiplicables si el número de columnas
de A coincide con el número de filas de B.
A mxn X B nxp = M mxp
El elemento Cij de la matriz producto se obtiene multiplicando cada elemento de la fila i
de la matriz A por cada elemento de la columna j de la matriz B y sumándolos, ejemplo:
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] A = new int[3][3]; // Creamos las 3 matrices 
        int[][] B = new int[3][3]; // A y B serán las que multipliquemos
        int[][] C = new int[3][3]; // La matriz C será el resultado de la multiplicación de A y B

        // Rellenamos las matrices A y B con números aleatorios usando Math.random()
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { // Mientras la posición de i y de j sea menor que 3, se hará lo del dentro del bucle
                A[i][j] = (int)(Math.random() * 100) + 1; // Añadiremos un número random usando el Math.random y como este da 
                B[i][j] = (int)(Math.random() * 100) + 1; // un numero entre 0 y 1 lo multiplico por 100 y le sumo 1 para evitar el decimal
            }
        }

        // Multiplicamos las matrices y guardamos su resultado
        for (int i = 0; i < 3; i++) { // Volvemos a hacer lo mismo que el paso anterior con los bucles 
            for (int j = 0; j < 3; j++) { // pero esta vez cambiamos lo que hace para que multiplique 
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j]; /*Esto nos permite multiplicar la matriz
                    la formula nos indica que la matriz C es la suma de las filas(I) y columnas(K) de A
                    multiplicadas por las columnas(j) y las filas(k) de B. Lo que nos permite
                    sumar el resultado a las filas (i) y columnas (j) de C*/ 
                }
            }
        }

        //IMPRIMIR RESULTADOS DE LAS MATRICES:

        // Imprimimos la matriz A
        System.out.println("\nMatriz A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + "\t"); // EL "\t" es para añadir tabulaciones en horizontal al imprimir la matriz y que no se vea todo junto
            }
            System.out.println(); //Nos permite añadir espacios en vertical (para que no salgan todos seguidos)
        }

        // Imprimimos la matriz B
        System.out.println("\nMatriz B: "); //Lo mismo que en la matriz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprimimos la matriz C (resultado de A x B)
        System.out.println("\nMatriz C (A x B): "); 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}