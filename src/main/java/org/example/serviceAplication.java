package org.example;

import java.util.Scanner;

public class serviceAplication {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre");
        String name = entrada.nextLine();
        System.out.println("Por favor ingrese su numero de celular");
        String cellphone = entrada.nextLine();
        System.out.println("Por favor ingrese su edad");
        String age = entrada.nextLine();

        System.out.println("Bienvenido señor(a) " + name+", "+ "es un placer para nosotros contar con una persona de " + age + " años");
        System.out.println("Proximamente nos comunicaremos con usted al número " + cellphone);





        System.out.println("Bienvenido");

    }
}
