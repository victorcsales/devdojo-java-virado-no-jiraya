package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Antonio";
        funcionario.idade = 36;
        funcionario.salario= new double[]{1500,2500,3000,5000};

        funcionario.imprimi();
        funcionario.meidaSalaria();
    }
}
