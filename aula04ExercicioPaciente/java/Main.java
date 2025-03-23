package aula04ExercicioPaciente.java;

public class Main {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente("Luiz Miguel");

        paciente1.cadastraDados("1234567", "Rua A, 123", "91111-2222", 2003, "Engenheiro");

        paciente2.cadastraDados("7654321", "Rua B, 456", "93333-4444", 2000, "Pediatra");

        System.out.println("Dados do Paciente 1:");
        paciente1.imprimeDados();
        System.out.println("Idade do Paciente 1: " + paciente1.calculaIdade(2025) + " anos");

        System.out.println("\nDados do Paciente 2:");
        paciente2.imprimeDados();
        System.out.println("Idade do Paciente 2: " + paciente2.calculaIdade(2025) + " anos");
    }
}