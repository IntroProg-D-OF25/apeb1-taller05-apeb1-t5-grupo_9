import java.util.Scanner;



/***
 * Calculo de impuestos: Desarrollar una solución que permita leer los datos de un automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 * 
 * @author Dava
 */
public class Ejercicio12_CalculoDeImpuestos {
    public static void main(String[] args) {
        String marca;
        int origen;
        double costo, impuesto, preciototal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la marca de su auto: ");
        marca= teclado.next();
        System.out.print("Ingrese el origen de su auto.  PRESIONE (1) para Alemania, (2) para USA, (3) para Japon y (4) para Italia:  ");
        origen= teclado.nextInt();
        System.out.print("Ingrese el costo: ");
        costo = teclado.nextDouble();
        
        switch (origen) {
            case 1: System.out.println("El impuesto es del 20%");
            impuesto = costo * 0.20;
            preciototal= costo + impuesto;
            System.out.println("El precio de venta de su " + marca +", es de= " + preciototal);
            break;
            case 2: System.out.println("El impuesto es del 8%");
            impuesto = costo * 0.8;
            preciototal= costo + impuesto;
            System.out.println("El precio de venta de su " + marca +", es de= " + preciototal);
            break;
            case 3: System.out.println("El impuesto es del 30%");
            impuesto= costo * 0.30;
            preciototal= costo + impuesto;
            System.out.println("El precio de venta de su " + marca +", es de= " + preciototal);
           break;
            case 4: System.out.println("El impuesto es del 15%");
            impuesto= costo * 0.15;
            preciototal= costo + impuesto;
            System.out.println("El precio de venta de su " + marca + ", es de= " + preciototal);
            break;
           
        }
       
       /***
        * Ingrese la marca de su auto: Toyota
Ingrese el origen de su auto.  PRESIONE (1) para Alemania, (2) para USA, (3) para Japon y (4) para Italia:  2
Ingrese el costo: 567
El impuesto es del 8%
El precio de venta de su Toyota, es de= 1020.6
        */
            
        
                
        
    }
}

