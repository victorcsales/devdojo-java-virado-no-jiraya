package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;


    static {
        System.out.println("Dentro do bloco de inicialização Estatico Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização Estatico 1 Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização Estatico 2 Funcionario");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor fucioanrio");
    }

    public void imprimi(){
        super.imprimi();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" recebi o salario de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
