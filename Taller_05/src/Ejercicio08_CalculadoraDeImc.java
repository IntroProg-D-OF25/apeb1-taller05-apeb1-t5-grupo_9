/**
 *Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona 
 * y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio08_CalculadoraDeImc {
   public static void main(String[] args) {
       double altura, peso, imc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu peso: ");
         peso = scanner.nextDouble();
        System.out.print("Ingresa tu altura: ");
         altura = scanner.nextDouble();
         imc = peso / (altura * altura);
        if (imc >= 1 && imc <= 22) {
            System.out.println("Tienes que comer más");
        } else if (imc > 22 && imc < 25) {
            System.out.println("Tienes el peso normal");
        } else if (imc >= 25) {
            System.out.println("Tienes sobrepeso");
        }
    }
}

/*
Ingresa tu peso: 60,5
Ingresa tu altura: 1,71
Tienes que comer más

Ingresa tu peso: 80
Ingresa tu altura: 1,60
Tienes sobrepeso

Ingresa tu peso: 57
Ingresa tu altura: 1,60
Tienes el peso normal
*/