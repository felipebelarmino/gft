package start_uni;
import java.util.Scanner;

public class VideoGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto videoGame = new Produto();

        System.out.println("Entre com o nome do game:");
        videoGame.nome = scan.nextLine();

        System.out.println("É usado? false ou true:");
        videoGame.usado = Boolean.valueOf(scan.nextLine());

        System.out.println("Entre com a quantidade:");
        videoGame.qtd = scan.nextInt();

        videoGame.statusGame();
    }
}
