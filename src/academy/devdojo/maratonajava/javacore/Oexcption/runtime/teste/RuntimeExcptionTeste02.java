package academy.devdojo.maratonajava.javacore.Oexcption.runtime.teste;

public class RuntimeExcptionTeste02 {
    public static void main(String[] args) {
        dividao(1,0);

        System.out.println("Codigo finalizado");
    }
    private static int dividao(int a, int b){
        if (b==0){
            throw new RuntimeException("Argumento invalido, não pode ser zero");
        }
        return a/b;
    }
}

