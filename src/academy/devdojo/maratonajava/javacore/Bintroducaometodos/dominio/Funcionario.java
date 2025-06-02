package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salario;

    public void imprimi() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double sal : salario) {
            System.out.print("R$: " + sal + " ");
        }
    }

    public void meidaSalaria() {
        for (double sal : salario) {
            for (int i = 0; i < 3; i++) {
                if (i < 2) {
                    sal += sal;

                }
            }
            double calculoMedia = sal / 3;
            System.out.println("\nMedia Salarial "+calculoMedia);
            return;
        }
    }


}
