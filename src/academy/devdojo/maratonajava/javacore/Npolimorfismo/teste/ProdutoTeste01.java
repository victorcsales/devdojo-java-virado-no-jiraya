package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalcularImpostos;

import javax.swing.plaf.IconUIResource;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("DELL", 1000);
        Tomate tomate = new Tomate("Cereja", 10);
        Televisao tv = new Televisao("Samsung 50\" " ,2000);
        CalcularImpostos.calcularImposto(computador);
        System.out.println("---------------------------------------");
        CalcularImpostos.calcularImposto(tomate);
        System.out.println("---------------------------------------");
        CalcularImpostos.calcularImposto(tv);
    }
}
