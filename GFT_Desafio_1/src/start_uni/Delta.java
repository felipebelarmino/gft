package start_uni;
import java.util.*;

public class Delta {
    Scanner scan = new Scanner(System.in);
    double a, b, c;
    double delta, x1, x2;

    public Delta() {
        deltaCalculo();
    }
    private void deltaCalculo() {
        System.out.println("Entre com os valores A, B e C para calcular.");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Impossível calcular.");
            System.exit(0);
        }

        delta = (b * b) + (-4 * (a * c));

        if (delta >= 0) {
            calculaX();
        } else {
            System.out.println("Delta não possui raiz");
            System.exit(0);
        }
    }
    private void calculaX() {
        x1 = ((-(b)+Math.sqrt(delta)) / 2 * a);
        x2 = ((-(b)-Math.sqrt(delta)) / 2 * a);

        System.out.printf( "X1 = "+"%.5f", x1/100 );
        System.out.println();
        System.out.printf( "X2 = "+"%.5f", x2/100 );
    }
    public static void main(String[] args) {
        new Delta();
    }
}
