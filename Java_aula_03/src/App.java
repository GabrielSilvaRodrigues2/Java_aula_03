import java.io.FileOutputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        testandoWhile();
        test();
    }
    public static void test() throws FileOutputStream{
        var stream = FileOutputStream();
    }
    public static void testandoWhile(){
        Scanner sc = new Scanner();
        for(;;){
            System.out.println("Digite um nome: ");
            var name = sc.nextLine();
            if(name.equalsIgnoreCase("exit")) break;
            System.out.println(name);
        }
        String name = "";
        do{
            System.out.println("Informe um nome: ");
            name = sc.nextLine();
            System.out.println(name);
        } while(!name.equalsIgnoreCase("exit"));
        sc.close();
    }
}
