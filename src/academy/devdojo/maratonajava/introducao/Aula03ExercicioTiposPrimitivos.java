package academy.devdojo.maratonajava.introducao;

import javax.xml.crypto.Data;

public class Aula03ExercicioTiposPrimitivos {
    public static void main(String[] args) {
        String nome = "João";
        String endereco = "Rua xxx";
        double salario = 2000;
        String dataRecebimento = "25/05/2024";
        String relatorio = "Eu "+nome+", moro no endereço "+endereco+", confirmo que recebi o salario de "+salario+
                " na data "+dataRecebimento;

        System.out.println("Eu "+nome+", moro no endereço "+endereco+", confirmo que recebi o salario de "+salario+
                " na data "+dataRecebimento);
        System.out.println(relatorio);
    }
}
