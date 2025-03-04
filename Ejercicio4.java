/* Escribe un programa que convierta una frase escrita con cualquier combinación de mayúsculas y minúsculas, en el nombre de una
* variable que utilice la nomenclatura "camello o camel". Por ejemplo la frase "Me GUsta merenDAR gaLLETAS" se convertirá en
* "meGustaMerendarGalletas". Supondremos que cada palabra que compone la frase está separada por un único espacio en blanco.
*/
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");
        String frase = leerDatos.nextLine();

        /* No se como hacer esto exactamente, se que tendria que usar el uppercase y lowercase para cambiar mayusculas y minusculas
        pero no se como seguir y tampoco me da mas tiempo a terminar el ejercicio. Te lo dejo sin hacer este

        Supongo que tambien tendria que usar un bucle for para la posición de la primera letra mayuscula
        */
        leerDatos.close();
    }
}