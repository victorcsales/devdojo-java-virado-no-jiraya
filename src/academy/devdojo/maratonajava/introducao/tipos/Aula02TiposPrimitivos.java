package academy.devdojo.maratonajava.introducao.tipos;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //tipos primitivos incritos em letras minuslucas: int, double, float, char, byte, long, boolean
        int age = 18;
        long numeroGrande = 11000000L;
        double salarioDoble = 2000D;
        float salarioFloat = (float) 2000.0D;// () casting seria força a o tipo a receber um
        // valor mesmo se caber na tipo isso não é uma boa pratica
        byte idadeByte = 18;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 'M';
        String nome = "Goku";

        System.out.println("A idade é "+age+" anos");
        System.out.println("Oi meu nome é "+nome);
    }
}
