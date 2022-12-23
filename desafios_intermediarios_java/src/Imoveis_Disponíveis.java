import java.util.Scanner;

public class Imoveis_Disponíveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];

        array = frase.split("/");

        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == '/') {
                array[i] = array[i].substring(1);
            }
            if (array[i].charAt(array[i].length() - 1) == '/') {
                array[i] = array[i].substring(0, array[i].length() - 1);
            }
        }

        System.out.println("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);

    }
}