package academy.devdojo.maratonajava.introducao.condicionais;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        //String mensagemDoar = "Vou doar 500 para o DevDojo";
        //String mensagemNaoDoar = "Ainda não tenho condições mas vou ter";
        //(condicao)?verdadeiro : falso
        String resultado = salario > 5000 ? "Vou doar 500 para o DevDojo" : "Ainda não tenho condições mas vou ter";

        System.out.println(resultado);
    }
}
