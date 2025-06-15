package academy.devdojo.maratonajava.javacore.Oexcption.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    @Override
    public void salvar() throws LoginInvalidoExcption,FileNotFoundException{
        System.out.println("Salvando Funcionario");
    }
}
