package academy.devdojo.maratonajava.javacore.Oexcption.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexcption.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexcption.exception.dominio.LoginInvalidoExcption;
import academy.devdojo.maratonajava.javacore.Oexcption.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobreescritaExcptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoExcption | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
