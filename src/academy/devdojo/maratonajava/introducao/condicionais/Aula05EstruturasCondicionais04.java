package academy.devdojo.maratonajava.introducao.condicionais;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 7000;
        double salarioAno = salario * 12;
        System.out.println(salarioAno);
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terciraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAno <= 14712){
            valorImposto = salarioAno * primeiraFaixa;
        } else if (salarioAno >= 34713 && salarioAno <= 68505) {
            valorImposto = salarioAno * segundaFaixa;
        }else {
            valorImposto =salarioAno * terciraFaixa;
        }

        System.out.println(valorImposto);
    }
}
