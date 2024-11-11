/**
 *Comprobar si un año ingresado es bisiesto o no.
 * Si es bisiesto, mostrar un mensaje especial.
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        int año;
        System.out.print("Ingrese un año: ");
        Scanner tcl = new Scanner(System.in);
        año = tcl.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("el año: " + año + ",es bisiesto");
        } else {
                System.out.println("el año: "+ año +",no es bisiesto");
        }
    } 
}
/*
    Ingrese un año: 2024
    el año: 2024,es bisiesto

    Ingrese un año: 2025
    el año: 2025,no es bisiesto
*/

