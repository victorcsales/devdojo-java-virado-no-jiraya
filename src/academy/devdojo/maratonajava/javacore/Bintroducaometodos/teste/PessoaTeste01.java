package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
/*        pessoa.nome ="jiraya";
        pessoa.idade = 40;*/
        pessoa.setNome("Jyraia");
        pessoa.setIdade(70);
        pessoa.imprimi();
    }

}
