package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if (idade<0){
            System.out.println("Idade invalida valor menor que zero.");
            return;
        }
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }
}
