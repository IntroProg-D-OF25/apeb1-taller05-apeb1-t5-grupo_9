
import java.util.Scanner;

/***
 * Categoría de Edad: Clasificar a una persona en una categoría de edad (niño, adolescente, adulto) en función de su edad.
 * @author Dava
 */
public class Ejercicio06_CategoriaDeEdad {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad= teclado.nextInt();
        if (edad<14)
            System.out.println("Niño");
        if ((edad>14) && (edad<18))
            System.out.println("Adolescente");
        if (edad >= 18)
            System.out.println("Adulto");
            
    }
}
/***
 * Ingrese su edad
15
Adolescente
 */
