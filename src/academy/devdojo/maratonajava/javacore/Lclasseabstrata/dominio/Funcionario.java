package academy.devdojo.maratonajava.javacore.Lclasseabstrata.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaSalario();
    }

    @Override
    public void imprimi() {
        System.out.println("Imprimindo...");
    }

    public abstract void calculaSalario();

}
