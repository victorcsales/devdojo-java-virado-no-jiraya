package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {

    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome= "jose";
        estudante01.idade= 30;
        estudante01.sexo='M';

        estudante02.nome = "Maria";
        estudante02.idade = 25;
        estudante02.sexo = 'F';

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);
        System.out.println("************************");
        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);




    }
}
