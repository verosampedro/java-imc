package dev.verosampedro;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Estatura en metros(ejemplo: 1,70): ");
        double estatura = scanner.nextDouble();

        Persona persona = new Persona(peso, estatura);
        double imc = CalculadoraIMC.calcularIMC(persona);

        System.out.println("El IMC es: " + imc);

        EstadoPersona.interpretarIMC(imc);

        scanner.close();
    }
}
