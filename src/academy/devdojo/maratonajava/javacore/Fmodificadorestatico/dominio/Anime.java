package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    //0 - Bloco de inicialização estatica da superclass e executado quando a JVM carrega a classe pai
    //1 - Bloco de inicialização estatica da sub e executado quando a JVM carrega a classe filha
    //2 - Aloca espaço na memoria para o objeto da superclass
    //3 - Cada atributo da superclass e criada e inicializada com valores dafault ou o que for passado
    //4 - O bloco de inicialização da superclass e executado na ordem que aparece
    //5 - Construtor e executado da superclass
    //6 - Aloca espaço na memoria para o objeto da subclass
    //7 - Cada atributo da subclass e criada e inicializada com valores dafault ou o que for passado
    //8 - O bloco de inicialização da subclass e executado na ordem que aparece
    //9 - Construtor e executado da subclass
    static {
        //bloco de inicialização de instacia
        System.out.println("Dentro do bloco de iniciaçização statico");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;

        }

    }

    static {
        System.out.println("Dentro do bloco de iniciaçização 02 statico");
    }

    static {
        System.out.println("Dentro do bloco de iniciaçização 03 statico");
    }

    {
        System.out.println("Dentro do bloco de iniciaçização 01 não statico");
    }

    {
        System.out.println("Dentro do bloco de iniciaçização 02 não statico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodios: Anime.episodios){
            System.out.print(episodios+" ");
        }
        System.out.println();

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
