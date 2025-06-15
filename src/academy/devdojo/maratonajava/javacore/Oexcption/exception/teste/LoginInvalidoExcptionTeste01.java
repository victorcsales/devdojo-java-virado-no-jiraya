package academy.devdojo.maratonajava.javacore.Oexcption.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexcption.exception.dominio.LoginInvalidoExcption;

import java.util.Scanner;

public class LoginInvalidoExcptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoExcption e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoExcption {
        Scanner scanner = new Scanner(System.in);
        String userNameDB = "Jose";
        String senhaDB = "145sd5";
        System.out.println("Usuario");
        String userNameDigitado = scanner.nextLine();
        System.out.println("Senha");
        String senhaDigitada = scanner.nextLine();

        if (!userNameDB.equals(userNameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoExcption("Usuario o senha invalida");

        }
        System.out.println("Usuario logado com sucesso");
    }
}
