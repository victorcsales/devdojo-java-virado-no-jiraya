package academy.devdojo.maratonajava.introducao.condicionais;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean autorizadoComprarBebidaAlcolica = idade >= 18;
        if(autorizadoComprarBebidaAlcolica){
            System.out.println("Autorizado a comprar bebida alcolica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcolica");
        }
        if(!autorizadoComprarBebidaAlcolica){
            System.out.println("Não autorizado a comprar bebida alcolica");
        }
        System.out.println("Fora do if");
    }
}
