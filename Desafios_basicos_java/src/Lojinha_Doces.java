import java.util.Scanner;

public class Lojinha_Doces {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double dinheiro = scanner.nextDouble();

    int doce = (int) (dinheiro / 0.5);

    System.out.println( "O cliente obteve " + doce + " doces");
  }
}