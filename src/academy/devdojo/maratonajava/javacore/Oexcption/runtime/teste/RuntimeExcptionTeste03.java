package academy.devdojo.maratonajava.javacore.Oexcption.runtime.teste;

import com.sun.source.tree.BreakTree;

public class RuntimeExcptionTeste03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String  abreConexao(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }return null;
    }
    public static String  abreConexao2(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }
        finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }

}

