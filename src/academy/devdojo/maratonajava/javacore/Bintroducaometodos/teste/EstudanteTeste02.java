package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();
        estudante.nome = "Antonio";
        estudante.idade = 40;
        estudante.sexo  ='M';

        estudante02.nome = "Maria";
        estudante02.idade = 25;
        estudante02.sexo = 'F';

        estudante.imprimi();
        estudante02.imprimi();


    }
}
