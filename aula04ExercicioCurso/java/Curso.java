package aula04ExercicioCurso.java;

public class Curso {

    private String nome;
    private int quantidadeAlunos;
    private String turma;
    private float mensalidade;

    public Curso() {
        this.nome = "";
        this.quantidadeAlunos = 0;
        this.turma = "";
        this.mensalidade = 0.0f;
    }


    public Curso(String nome, int quantidadeAlunos, String turma, float mensalidade) {
        this.nome = nome;
        this.quantidadeAlunos = quantidadeAlunos;
        this.turma = turma;
        this.mensalidade = mensalidade;
    }


    public void cadastraCurso(String nome, int quantidadeAlunos, String turma, float mensalidade) {
        this.nome = nome;
        this.quantidadeAlunos = quantidadeAlunos;
        this.turma = turma;
        this.mensalidade = mensalidade;
    }

    public void imprimeDados() {
        System.out.println("Nome do curso: " + this.nome);
        System.out.println("Quantidade de alunos: " + this.quantidadeAlunos);
        System.out.println("Turma: " + this.turma);
        System.out.println("Mensalidade: R$ " + this.mensalidade);
    }


    public float calculaTotalMensalidade() {
        return this.quantidadeAlunos * this.mensalidade;
    }
}