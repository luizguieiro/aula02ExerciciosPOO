package aula04ExercicioPaciente.java;

public class Paciente {

    private String nome;
    private String rg;
    private String endereco;
    private String telefone;
    private int anoNascimento;
    private String profissao;

    public Paciente() {
        this.nome = "";
        this.rg = "";
        this.endereco = "";
        this.telefone = "";
        this.anoNascimento = 0;
        this.profissao = "";
    }

    public Paciente(String nome) {
        this.nome = nome;
        this.rg = "";
        this.endereco = "";
        this.telefone = "";
        this.anoNascimento = 0;
        this.profissao = "";
    }

    public void cadastraDados(String rg, String endereco, String telefone, int anoNascimento, String profissao) {
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.anoNascimento = anoNascimento;
        this.profissao = profissao;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("RG: " + this.rg);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Ano de Nascimento: " + this.anoNascimento);
        System.out.println("Profissão: " + this.profissao);
    }

    public int calculaIdade(int anoAtual) {
        return anoAtual - this.anoNascimento;
    }
}