/***
 * Edad para Votar: Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).
 */

import java.util.Scanner;


public class Ejercicio01_EdadParaVotar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su edad: ");
        edad= teclado.nextInt();
        if (edad <18)
            System.out.println("No es apto");
        else
            System.out.println("Es apto para votar");
               
    }
  
}
/***
 * 
Ingrese su edad: 15
No es apto
 */
