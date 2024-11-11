/***
 * Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 */
import java.util.Scanner;

public class Ejercicio09_OrdenamientoDeTresNumeros {
    public static void main(String[] args) {
        int a, b, c, primero = 0, segundo = 0, tercero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        b = teclado.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        c = teclado.nextInt();
        if ((a <= b) && (a <= c)) {
            primero = a;
            if (b <= c) {
                segundo = b;
                tercero = c;
            } else {
                segundo = c;
                tercero = b;
            }
        }
        if ((b <= a) && (b <= c)) {
            primero = b;
            if (a <= c) {
                segundo = a;
                tercero = c;
            } else {
                segundo = c;
                tercero = a;
            }
        }
        if ((c <= a && c <= b)) {
            primero = c;
            if (a <= b) {
                segundo = a;
                tercero = b;
            } else {
                segundo = b;
                tercero = a;
            }
        }
        System.out.println("El primer numero es: " + primero);
        System.out.println("El segundo numero es: " + segundo);
        System.out.println("El tercer numero es: " + tercero);
    }
}

/***
 * Ingrese el primer numero: 
67
Ingrese el segundo numero: 
34
Ingrese el tercer numero: 
89
El primer numero es: 34
El segundo numero es: 67
El tercer numero es: 89
 */


