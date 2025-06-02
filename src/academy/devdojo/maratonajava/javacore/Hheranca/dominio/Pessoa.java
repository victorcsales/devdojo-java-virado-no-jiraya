package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização Estatico Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização Estatico 1 Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização Estatico 2 Pessoa");
    }

    public Pessoa (String nome){
        System.out.println("Dentro do contrutor de pessoa");
        this.nome = nome;
    }

    public Pessoa (String nome,String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua());
        System.out.println(this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
