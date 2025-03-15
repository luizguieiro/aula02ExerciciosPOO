package exercicioPacientePOO.java;

class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    String dataNascimento;
    String profissao;

    public Paciente() {}

    public Paciente(String nome) {
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Profissão: " + profissao);
        System.out.println();
    }
}

