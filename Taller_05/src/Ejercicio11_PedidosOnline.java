/**
 * Desarrollar una solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, 
 * la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades,
 * se hace un descuento del 15%.
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la descripción del artículo: ");
        String descripcion = tcl.nextLine();
        System.out.print("Ingrese la cantidad requerida: ");
        int cantidad = tcl.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = tcl.nextDouble();
        double subtotal = cantidad * precioUnitario;
        double descuento = 0;
        if (cantidad > 50) {
            descuento = subtotal * 0.15; 
            System.out.println("Felicidades Su compra aplica para un descuento del 15% y es de: $"+descuento);
        } else {
            System.out.println("Lo sentimos, no hay descuento.");
        }

        double total = subtotal - descuento;
        System.out.println("Descripción del artículo: " + descripcion);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total a pagar: $" + total);
    }
}

/*
Ingrese la descripción del artículo: computadora hp
Ingrese la cantidad requerida: 50
Ingrese el precio unitario: 300
Lo sentimos, no hay descuento.
Descripción del artículo: computadora hp
Subtotal: $15000.0
Total a pagar: $15000.0

Ingrese la descripción del artículo: iphone 16
Ingrese la cantidad requerida: 100
Ingrese el precio unitario: 1060
Felicidades Su compra aplica para un descuento del 15% y es de: $15900.0
Descripción del artículo: iphone 16
Subtotal: $106000.0
Total a pagar: $90100.0
*/