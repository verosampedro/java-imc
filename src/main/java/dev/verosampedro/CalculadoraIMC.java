package dev.verosampedro;

public class CalculadoraIMC {
    public static double calcularIMC(Persona persona) {
        return persona.peso / Math.pow(persona.estatura, 2);
    }
}
