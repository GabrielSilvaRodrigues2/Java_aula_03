import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        testandoWhile();
        test();
    }

    // Corrigido: não lança exceção, inicializa corretamente FileOutputStream
    public static void test() {
        try {
            FileOutputStream stream = new FileOutputStream("output.txt");
            // ...pode adicionar lógica de escrita se necessário...
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testandoWhile() {
        Scanner sc = new Scanner(System.in); // Corrigido para usar System.in
        for (;;) {
            System.out.println("Digite um nome: ");
            var name = sc.nextLine();
            if (name.equalsIgnoreCase("exit")) break;
            System.out.println(name);
        }
        String name = "";
        do {
            System.out.println("Informe um nome: ");
            name = sc.nextLine();
            System.out.println(name);
        } while (!name.equalsIgnoreCase("exit"));
        sc.close();
    }
}
