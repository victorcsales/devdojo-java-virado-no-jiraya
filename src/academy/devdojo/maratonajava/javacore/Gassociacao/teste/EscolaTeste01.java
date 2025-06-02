package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("João");
        Professor professor1 = new Professor("Maria");
        Professor professor2 = new Professor("Jose");
        Professor [] professores = {professor,professor1,professor2};
        Escola escola = new Escola("XX",professores);

        escola.imprimi();
    }
}
