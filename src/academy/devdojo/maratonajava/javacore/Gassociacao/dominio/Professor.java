package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario [] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimir(){
        System.out.println("---------------");
        System.out.println("Professor: "+this.nome);
        if (this.seminarios == null)return;
        System.out.println("****Seminarios cadastrados: ");
        for (Seminario seminarios : this.seminarios) {
            System.out.println(seminarios.getTitulo());
            System.out.println(seminarios.getLocal().getEndereco());
            if (seminarios.getAlunos() == null || seminarios.getAlunos().length==0)continue;
            System.out.println("********** Alunos:");
            for (Aluno alunos : seminarios.getAlunos()) {
                System.out.println("Aluno: "+alunos.getNome()+" idade: "+alunos.getIdade());
            }

        }


    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
       this.especialidade = especialidade;
    }
}
