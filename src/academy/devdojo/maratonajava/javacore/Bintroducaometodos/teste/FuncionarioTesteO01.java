package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioO;

public class FuncionarioTesteO01 {
    public static void main(String[] args) {
        FuncionarioO funcionarioO = new FuncionarioO();
        funcionarioO.setNome( "João");
        funcionarioO.setIdade(37);
        funcionarioO.setSalarios(new double[]{1200,987.32,2000});

        funcionarioO.imprime();
    }
}
