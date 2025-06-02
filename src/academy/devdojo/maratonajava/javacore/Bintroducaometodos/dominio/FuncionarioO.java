package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioO {
    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSlario;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
            for (double salario : salarios) {
                System.out.print("R$: " + salario + " ,");
            }
        mediaSarial();
    }

    public void mediaSarial() {
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
                mediaSlario += salario;
            }
            mediaSlario/=salarios.length;
        System.out.println("\nMedia Salarial: " + mediaSlario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMediaSlario() {
        return mediaSlario;
    }
}
