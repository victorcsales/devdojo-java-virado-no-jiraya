package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;//todos os atributos de uma interface por padrão são uma constante

    public abstract void load();
    default void checkPermission(){
        System.out.println("Checando permissões");
    }
    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface DataLoader");
    }
}