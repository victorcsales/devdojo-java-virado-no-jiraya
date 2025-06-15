package academy.devdojo.maratonajava.javacore.Oexcption.runtime.teste;

import java.io.FileNotFoundException;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class RuntimeExcptionTeste04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro da RuntimeException");
        }


        try {
            talvezLanceExcption();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();

        }
    }

    private static void talvezLanceExcption() throws SQLException, FileNotFoundException {

    }
}

