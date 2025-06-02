package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua 3");
        endereco1.setCep("0259-100");

        Pessoa pessoa1 = new Pessoa("Joao");
        pessoa1.setCpf("0254879869");
        pessoa1.setEndereco(endereco1);

        Funcionario funcionario1 = new Funcionario("Jose");
        funcionario1.setCpf("25489456864");
        funcionario1.setEndereco(endereco1);
        funcionario1.setSalario(2500);

        pessoa1.imprimi();
        System.out.println("-----------------------");
        funcionario1.imprimi();

    }
}
