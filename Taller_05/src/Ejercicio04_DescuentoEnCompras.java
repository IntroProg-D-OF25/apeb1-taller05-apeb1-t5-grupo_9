/**
 *Calcular el precio final de un producto con un descuento del 10%
 * si el precio original es mayor de $100; de lo contrario,
 * no hay descuento.
 * 
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio04_DescuentoEnCompras {
    public static void main(String[] args) {
        int precioPro;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Cual es el precio de el producto: ");
        precioPro = tcl.nextInt();
        if (precioPro > 100) {
            System.out.println("Felicidades su producto aplica el descuento de 10% el total a pagar es de: $"+ (precioPro * 10 / 100));
        } else {
            System.out.println( "lo sentimos no hay descuento");
        }
    }
}

/*
    Cual es el precio de el producto: 200
    Felicidades su producto aplica el descuento de 10% el total a pagar es de : 20

    Cual es el precio de el producto: 90
    lo sentimos no hay descuento

*/   

