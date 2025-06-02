package academy.devdojo.maratonajava.introducao.condicionais;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 13;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feria");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
    }
}
