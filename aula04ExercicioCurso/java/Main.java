package aula04ExercicioCurso.java;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso("Pedagogia", 20, "A", 520.0f); // Usando o construtor com parâmetros

        curso1.cadastraCurso("Artes Cenicas", 25, "B", 450.0f);

        System.out.println("Dados do Curso 1:");
        curso1.imprimeDados();
        System.out.println("Total de mensalidades do Curso 1: R$ " + curso1.calculaTotalMensalidade());

        System.out.println("\nDados do Curso 2:");
        curso2.imprimeDados();
        System.out.println("Total de mensalidades do Curso 2: R$ " + curso2.calculaTotalMensalidade());
    }
}