package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Joao";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println("O professor " + professor.nome+ " com a idade "+professor.idade+" anos do sexo "+professor.sexo);
    }
}
