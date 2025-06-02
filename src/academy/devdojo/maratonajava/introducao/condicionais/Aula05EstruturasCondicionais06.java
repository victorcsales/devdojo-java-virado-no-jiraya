package academy.devdojo.maratonajava.introducao.condicionais;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        int dia = 68;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dias Uteis");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
