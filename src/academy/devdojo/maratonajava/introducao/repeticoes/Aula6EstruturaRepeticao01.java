package academy.devdojo.maratonajava.introducao.repeticoes;

public class Aula6EstruturaRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        //analisa a condição antes de executar
        while (count<10){
            System.out.println(++count);
        }
        count = 0;
        //Executa depois analisa a condição
        do {
            System.out.println("dentro do do-while " + ++count);
        }while (count<10);

        for (int i=0;i<10;i++){
            System.out.println("For "+i);
        }

    }
}
