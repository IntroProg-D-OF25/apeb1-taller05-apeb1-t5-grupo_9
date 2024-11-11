/***
 * En una hostería de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días
 * , del 15% si se hospeda más de 10 días
 * y del 20% si se hospeda más de 15 días.
 * Elaborar una solución que pida como datos de entrada el número de días
 * y el precio diario de la habitación y luego calcular e imprimir el subtotal por pagar,
 * el descuento y el total por pagar.
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio13_SistemaDeReservasHoteleras {
    public static void main(String[] args) {
      int dias;
      double precioHab, subtotal, descuento = 0, total;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese los días que se queda: ");
        dias = tcl.nextInt();
        System.out.print("Ingrese el precio diario de la habitación: ");
        precioHab = tcl.nextDouble();
        subtotal = dias * precioHab;
        if (dias > 15) {
            descuento = subtotal * 0.20;
        }    if (dias > 10) {
            descuento = subtotal * 0.15;
        }        if (dias > 5) {
            descuento = subtotal * 0.10;
        }
        total = subtotal - descuento;
        System.out.println("Subtotal por pagar: $" + subtotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total por pagar: $" + total);
    }
}

/*
Ingrese los días que se queda: 16
Ingrese el precio diario de la habitación: 25
Subtotal por pagar: $400.0
Descuento aplicado: $40.0
Total por pagar: $360.0

Ingrese los días que se queda: 11
Ingrese el precio diario de la habitación: 25
Subtotal por pagar: $275.0
Descuento aplicado: $27.5
Total por pagar: $247.5

Ingrese los días que se queda: 7
Ingrese el precio diario de la habitación: 25
Subtotal por pagar: $175.0
Descuento aplicado: $17.5
Total por pagar: $157.5
*/