package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");
        Jogador jogador2 = new Jogador("R10");
        Jogador jogador3 = new Jogador("Pele");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        Time time = new Time("Brasil");
        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---Jogador---");
        jogador1.imprimi();
        jogador2.imprimi();
        jogador3.imprimi();

        System.out.println("---Time---");
        time.imprimi();

    }
}
