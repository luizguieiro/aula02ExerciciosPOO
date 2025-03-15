package exercicioPacientePOO.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Paciente paciente1 = new Paciente();
        System.out.print("Digite o nome do paciente 1: ");
        paciente1.nome = scanner.nextLine();
        System.out.print("Digite o RG do paciente 1: ");
        paciente1.rg = scanner.nextLine();
        System.out.print("Digite o endereço do paciente 1: ");
        paciente1.endereco = scanner.nextLine();
        System.out.print("Digite o telefone do paciente 1: ");
        paciente1.telefone = scanner.nextLine();
        System.out.print("Digite a data de nascimento do paciente 1: ");
        paciente1.dataNascimento = scanner.nextLine();
        System.out.print("Digite a profissão do paciente 1: ");
        paciente1.profissao = scanner.nextLine();


        System.out.print("Digite o nome do paciente 2: ");
        String nomePaciente2 = scanner.nextLine();
        Paciente paciente2 = new Paciente(nomePaciente2);
        System.out.print("Digite o RG do paciente 2: ");
        paciente2.rg = scanner.nextLine();
        System.out.print("Digite o endereço do paciente 2: ");
        paciente2.endereco = scanner.nextLine();
        System.out.print("Digite o telefone do paciente 2: ");
        paciente2.telefone = scanner.nextLine();
        System.out.print("Digite a data de nascimento do paciente 2: ");
        paciente2.dataNascimento = scanner.nextLine();
        System.out.print("Digite a profissão do paciente 2: ");
        paciente2.profissao = scanner.nextLine();


        System.out.println("\nDados do Paciente 1:");
        paciente1.exibirDados();

        System.out.println("Dados do Paciente 2:");
        paciente2.exibirDados();

        scanner.close();
    }
}

