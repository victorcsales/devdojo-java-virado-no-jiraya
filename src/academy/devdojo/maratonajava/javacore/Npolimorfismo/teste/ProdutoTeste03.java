package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalcularImpostos;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Acer", 2000);
        Tomate tomate = new Tomate("Italiano", 20);
        tomate.setDataValidade("22/07/2025");

        CalcularImpostos.calcularImposto(tomate);
        System.out.println("-----------------------------");
        CalcularImpostos.calcularImposto(produto);

    }
}
