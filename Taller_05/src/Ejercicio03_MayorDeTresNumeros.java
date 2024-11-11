/***
 * Mayor de tres números: Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 */
import java.util.Scanner;


public class Ejercicio03_MayorDeTresNumeros {
    public static void main(String[] args) {
        int a , b ,c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = teclado.nextInt();
        System.out.println("Ingrese el tercer numero");
        c = teclado.nextInt();
        if ((a>b) && (a>c)) {
            System.out.println("El numero: " + a + "es el mayor");
        }
        if ((b>a)&&(b>c)) {
            System.out.println("El numero" + b + "es el mayor");
            
            
        }
        if ((c>a) && (c>b)) {
            System.out.println("El numero:" + c + "es el mayor");
            
        if ((a==b) || (a==c)) {
                System.out.println("Los numeros son iguales");
        }
                
    }
    }
}
/***
 * Ingrese el primer numero: 
2
Ingrese el segundo numero
3
Ingrese el tercer numero
5
El numero:5es el mayor
 */
