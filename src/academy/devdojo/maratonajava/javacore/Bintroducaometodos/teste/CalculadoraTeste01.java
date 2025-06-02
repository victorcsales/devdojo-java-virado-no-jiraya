package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(5,8);
        double resultado = calculadora.dividiDoisNumeros(20,2);

        System.out.println(resultado);
        calculadora.imprimeDividiDoisNumeros(10,3);
        calculadora.alteraDoisNumeros(12,5);
    }
}
