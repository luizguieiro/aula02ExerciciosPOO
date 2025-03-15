package exercicioProdutoPOO.java;

class Produto {
    String marca;
    String fabricante;
    String cod_barras;
    float preco;


    public Produto() {}


    public Produto(String marca, String fabricante, String cod_barras, float preco) {
        this.marca = marca;
        this.fabricante = fabricante;
        this.cod_barras = cod_barras;
        this.preco = preco;
    }


    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Código de Barras: " + cod_barras);
        System.out.println("Preço: " + preco);
        System.out.println();
    }
}

