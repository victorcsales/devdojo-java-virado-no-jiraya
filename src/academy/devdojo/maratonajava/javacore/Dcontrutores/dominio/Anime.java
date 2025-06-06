package academy.devdojo.maratonajava.javacore.Dcontrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String studio;

    public Anime(String nome,String tipo,int episodios,String genero){
        this();//Deve ser obrigatoriamente a primeira linha a ser executada em um
        // construtor na sobrecara de construtores
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;

    }
    public Anime(String nome,String tipo,int episodios,String genero,String studio){
        this(nome,tipo,episodios,genero);//Deve ser obrigatoriamente a primeira linha a ser
        // executada em um na sobrecara de construtores
        this.studio = studio;

    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");

    }

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios =episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
