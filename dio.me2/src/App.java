import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        var male = new Person("Gabriel");
        System.out.println(male.getName());
        System.out.println(male.getAge());
    }
}
