package academy.devdojo.maratonajava.javacore.Minterfaces.teste;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader1 = new DatabaseLoader();
        FileLoader fileLoader1 = new FileLoader();
        databaseLoader1.load();
        fileLoader1.load();
        databaseLoader1.remove();
        fileLoader1.remove();
        databaseLoader1.checkPermission();
        fileLoader1.checkPermission();
        DataLoader.retriveMaxDataSize();
        DatabaseLoader.retriveMaxDataSize();
    }
}
