package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        //declaracion de variables.
        Scanner teclado = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion;
        double division;

        System.out.println("Ingrese el primer numero a operar");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero a operar");
        num2 = teclado.nextInt();
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);

    }

}
