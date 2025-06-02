package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
    public static void main(String[] args) {

        //0 - Bloco de inicialização estatica e executado quando a JVM carrega a classe
        //1 - Aloca espaço na memoria para o objeto
        //2 - CAsa atributo da classe e criada e inicializada com valores dafault ou o que for passado
        //3 - O bloco de inicialização e executado
        //4 - Construtor e executado

        Funcionario funcionario = new Funcionario("Jiraya");

    }
}
