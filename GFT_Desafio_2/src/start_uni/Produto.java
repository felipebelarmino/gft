package start_uni;

public class Produto {
    String modelo;
    Boolean usado;
    String nome;
    double preco;
    int qtd;
    String autor;
    String tema;

    void status() {
        System.out.println("Produto: "+this.nome);
        System.out.println("Tema: "+this.tema);
        System.out.println("Autor: "+this.autor);
        System.out.println("Preço: "+this.preco);
        System.out.println("Quantidade: "+this.qtd);
    }
    void statusGame() {
        System.out.println("Produto: "+this.nome);
        System.out.println("Usado: "+this.usado);
        System.out.println("Quantidade: "+this.qtd);
    }
}
