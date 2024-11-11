
import java.util.Scanner;

/***
 * Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 * @author Dava
 */
public class Ejercicio07_RangoDeNotas {
    public static void main(String[] args) {
        int calificacion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su calificacion: ");
        calificacion = teclado.nextInt();
        if ((calificacion>=90) && (calificacion <=100))
            System.out.println("A");
        if ((calificacion>=80) && (calificacion<=89))
            System.out.println("B");
        if ((calificacion>=70)&&(calificacion<=79))
            System.out.println("C");
        if ((calificacion>=60)&& (calificacion<=69))
            System.out.println("D");
        if (calificacion<=59)
            System.out.println("F");
                
                
    }
}
/***
 * Ingrese su calificacion: 
67
D
 */
