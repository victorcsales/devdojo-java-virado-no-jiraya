package academy.devdojo.maratonajava.introducao.tipos;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero1 = 10;
        double numero2 = 20;
        double operacao = numero1/numero2;
        System.out.println(numero1+numero2+" valor "+numero2+numero1);//dessa forma apos o +"valor" o java começa a concatenar
        System.out.println(operacao);

        // resto %
        int resto = 21%7;
        System.out.println(resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMemorQueVinte = 10<20;
        boolean isDezIgualQueVinte = 10==20;
        boolean isDezIgualQueDez = 10==10;
        boolean isDezDiferenteQueDez = 10!=10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMemorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezIgualQueDez);
        System.out.println(isDezDiferenteQueDez);

        // && || !
        int idade = 18;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario <= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        //= += -= /= *= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // -- ++
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);


    }
}
