package exercicioProdutoPOO.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Produto produto1 = new Produto();
        System.out.print("Digite a marca do produto 1: ");
        produto1.marca = scanner.nextLine();
        System.out.print("Digite o fabricante do produto 1: ");
        produto1.fabricante = scanner.nextLine();
        System.out.print("Digite o código de barras do produto 1: ");
        produto1.cod_barras = scanner.nextLine();
        System.out.print("Digite o preço do produto 1: ");
        produto1.preco = scanner.nextFloat();
        scanner.nextLine();


        System.out.print("Digite a marca do produto 2: ");
        String marca2 = scanner.nextLine();
        System.out.print("Digite o fabricante do produto 2: ");
        String fabricante2 = scanner.nextLine();
        System.out.print("Digite o código de barras do produto 2: ");
        String codBarras2 = scanner.nextLine();
        System.out.print("Digite o preço do produto 2: ");
        float preco2 = scanner.nextFloat();
        Produto produto2 = new Produto(marca2, fabricante2, codBarras2, preco2);


        System.out.println("\nDados do Produto 1:");
        produto1.exibirDados();

        System.out.println("Dados do Produto 2:");
        produto2.exibirDados();

        scanner.close();
    }
}