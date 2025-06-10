package ejercicioif;

import java.util.Scanner;

public class EjercicioIF {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();

        if (edad > 18) {
            System.out.println("Eres mayor de 18 de años");
            if(edad > 40 ){
                System.out.println("Eres generacion x");
            } else {
                System.out.println("Eres millennial");
            }
        } else {
            if (edad == 18 ){
                System.out.println("Tienes exactamente 18");
            } else {
                System.out.println("No puedes acceder eres menor de edad.");
            }
        }

    }

}
