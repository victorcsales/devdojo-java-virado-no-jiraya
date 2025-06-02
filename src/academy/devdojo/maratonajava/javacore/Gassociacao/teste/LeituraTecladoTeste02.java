package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraTecladoTeste02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua perguta e eu respondo Sim ou Não");
        System.out.println("---------------------------------------------");
        System.out.println("Digite sua pergunta abaixo:");
        String pergunta = entrada.nextLine();
        if (pergunta.charAt(0)==' '){
            System.out.println("Sim");
        }else System.out.println("Não");

    }
}
