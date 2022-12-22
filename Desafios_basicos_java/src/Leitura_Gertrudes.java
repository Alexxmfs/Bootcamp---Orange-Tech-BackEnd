import java.util.Scanner;

public class Leitura_Gertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int paginas = leitor.nextInt();

        int dias = paginas / 3;

        System.out.println(dias + " dias");
    }
}