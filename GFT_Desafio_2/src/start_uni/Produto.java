package start_uni;

public class Produto {
    String nome;
    double preco;
    int qtd;
    String autor;
    String tema;

    void status() {
        System.out.println("Produto: "+this.nome);
        System.out.println("Preço: "+this.preco);
        System.out.println("Quantidade: "+this.qtd);
    }
}
