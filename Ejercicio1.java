/* Hacer un programa que pida al usuario 1 número de dígitos y lo meta en un array de enteros.
Después pida otro número de 5 dígitos y lo meta en otro array de enteros. Después deberá comprobar recorriendo los arrays
si es un número capicúa o no, es decir se lee igual de izquierda a derecha que de derecha a izquierda. Por ejemplo 77377 es capicúa.
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        
        System.out.print("Introduce un número para ver si es capícua o no ");
        int num1 = leerDatos.nextInt();
        String num2 = Integer.toString(num1); //Este ejercicio lo tenia hecho ya en gran parte con IA, no se
        //para que sirve interger pero funciona.

        //Lo primero convertimos el número que hemos pedido al usuario
        //en una cadena para poder hacer mas facil la comprobación de si es o no capicúa
        
        boolean esCapicua = true; // Comprobamos si el número es capicúa con un bucle, en caso de que no sea capicua, el for lo cambiará a false
        int posiciones = num2.length(); //Convertimos los números que hemos obtenido en numero de posiciones
        for (int i = 0; i < posiciones / 2; i++) { // Mientras la I (que vale 0) sea menor que el número de posiciones dividido entre 2
            //(porque es la mitad, y asi me aseguro de que solo cogerá la mitad del número) seguirá haciendo el bucle.
            if (num2.charAt(i) != num2.charAt(posiciones - 1 - i)) { /* Esta función lo que nos permite es verificar el número 
                de la posición (num2.charat(i(posición))) sea igual que el ultimo número de la posición del mismo número, para esto
                obtenemos la posición restandole al número total de posiciones menos 1(porque suponiendo que es 5, al iniciar desde el 0
                serían 4 números) y menos el número de la posición permitiendonos empezar a contar desde el último número.
                (Me he liado un poco explicando esto al poner "posiciones" como nombre de la variable pero espero
                que haya quedado mas o menos claro)*/
                esCapicua = false;
                break; // Con esto saldremos del bucle porque si ya hemos decidido que no es capicua no hace falta seguir.
            }
        }
        
        // Y ya por ultimo, mostramos el resultado de todo
        if (esCapicua) {
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }
        
        leerDatos.close();
    }
}