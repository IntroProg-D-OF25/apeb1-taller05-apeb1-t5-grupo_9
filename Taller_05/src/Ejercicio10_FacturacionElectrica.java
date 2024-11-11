/**
 *Desarrollar una solución que permita calcular y mostrar el valor a cancelar de una planilla de luz.
 * Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes.
 * Si el usuario tiene edad mayor a 65 años, se debe descontar el 10% para pertenecer a la tercera edad.
 *
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio10_FacturacionElectrica {
    public static void main(String[] args) {
        int edad;
        double costoPorKilovatio,kilovatiosConsumidos,subtotal,descuento,totalAPagar;
        Scanner tcl = new Scanner(System.in);       
        System.out.print("Ingrese el costo por kilovatio/hora: ");
        costoPorKilovatio = tcl.nextDouble();
        System.out.print("Ingrese el número de kilovatios consumidos en el mes: ");
        kilovatiosConsumidos = tcl.nextDouble();        
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        subtotal = costoPorKilovatio * kilovatiosConsumidos;
        descuento = 0;
        if (edad > 65) {
            descuento = subtotal * 0.10;
            System.out.println("Descuento: $" + descuento);
        }
        totalAPagar = subtotal - descuento;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total a pagar: $" + totalAPagar);
    }
}
    
/*
Ingrese el costo por kilovatio/hora: 4,4
Ingrese el número de kilovatios consumidos en el mes: 40
Ingrese su edad: 68
Descuento: $17.6
Subtotal: $176.0
Total a pagar: $158.4
*/