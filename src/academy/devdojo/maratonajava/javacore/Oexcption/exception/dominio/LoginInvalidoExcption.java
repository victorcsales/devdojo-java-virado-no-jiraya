package academy.devdojo.maratonajava.javacore.Oexcption.exception.dominio;

public class LoginInvalidoExcption extends Exception{

    public LoginInvalidoExcption() {
        super("Login Invalido");
    }

    public LoginInvalidoExcption(String message) {
        super(message);
    }
}
