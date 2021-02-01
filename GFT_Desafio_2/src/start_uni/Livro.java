package start_uni;
import java.util.Scanner;

public class Livro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Produto livro = new Produto();

        System.out.println("Entre com o nome do livro:");
        livro.nome = scan.nextLine();

        System.out.println("Entre com o nome do autor:");
        livro.autor = scan.nextLine();

        System.out.println("Entre com o tema:");
        livro.tema = scan.nextLine();

        System.out.println("Entre com o preço do livro:");
        livro.preco = scan.nextDouble();

        System.out.println("Entre com a quantidade:");
        livro.qtd = scan.nextInt();

        livro.status();
    }
}
