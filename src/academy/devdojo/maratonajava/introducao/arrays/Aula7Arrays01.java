package academy.devdojo.maratonajava.introducao.arrays;

public class Aula7Arrays01 {
    public static void main(String[] args) {
        String [] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Korosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


    }
}
