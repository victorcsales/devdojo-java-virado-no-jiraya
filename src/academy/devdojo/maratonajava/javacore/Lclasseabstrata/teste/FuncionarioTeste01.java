package academy.devdojo.maratonajava.javacore.Lclasseabstrata.teste;

import academy.devdojo.maratonajava.javacore.Lclasseabstrata.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclasseabstrata.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclasseabstrata.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maria",3000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("jose", 6000);
        gerente.imprimi();
        desenvolvedor.imprimi();
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
