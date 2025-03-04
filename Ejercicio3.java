/* Realiza un programa que simule un editor de texto que, una vez que se ha introducido el texto,
permita reemplazar las ocurrencias de una palabra en otra.
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el texto:"); // Pedimos la frase que queramos luego cambiar
        String texto = leerDatos.nextLine(); //Usamos el Scanner para pedir la linea

        System.out.println("Introduce la palabra a reemplazar:"); // Pedimos la palabra que queremos reemplazar
        String palabraVieja = leerDatos.nextLine(); // Le asignamos lo que queramos cambiar con el nombre de palabraVieja

        System.out.println("Introduce la nueva palabra:"); //Pedimos la palabra nueva
        String palabraNueva = leerDatos.nextLine(); //Y le volvemos a asignar igual que antes pero ahora con el nombre de palabraNueva
        
        String textoModificado = texto.replace(palabraVieja, palabraNueva); //Creamos un nuevo string, este reemplazará la palabra vieja por la palabra nueva
        //Para esto he usado la colección de string con el metodo replace, hace todo mas sencillo y rapido
        
        System.out.println("Texto modificado:"); // y ya imprimimos le texto modificado
        System.out.println(textoModificado);
        
        leerDatos.close();
    }
}