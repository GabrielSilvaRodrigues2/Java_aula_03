import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();

        String urlSemEspaco = url.trim();
        String urlMinusculo = urlSemEspaco.toLowerCase();
        String identificador = urlMinusculo;

        System.out.println(identificador);

        scanner.close();
    }
}
