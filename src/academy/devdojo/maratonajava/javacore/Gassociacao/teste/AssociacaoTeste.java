package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua condado 158");
        Aluno aluno = new Aluno("Jose",25);
        Aluno aluno1 = new Aluno("Maria",24);
        Professor professor = new Professor("Antonio", "Fisica");
        Aluno alunosSeminario [] = {aluno,aluno1};
        Seminario seminario = new Seminario("Semininario de Fisica",alunosSeminario,local);

        Seminario seminariosDiponiveis [] = {seminario};

        professor.setSeminarios(seminariosDiponiveis);

        professor.imprimir();
    }
}
