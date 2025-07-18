import java.util.Scanner;

public class App {
    private final static Scanner sc = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) throws Exception {
        int option = 0;
        do { 
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet.");
            System.out.println("2 - Abastecer a máquina com água.");
            System.out.println("3 - Abastecer a máquina com shampoo.");
            System.out.println("4 - Verificar água da máquina.");
            System.out.println("5 - Verificar shampoo da máquina.");
            System.out.println("6 - Verificar se tem pet no banho.");
            System.out.println("7 - Colocar pet na máquina.");
            System.out.println("8 - Retirar pet da máquina.");
            System.out.println("9 - Limpar a máquina.");
            System.out.println("0 - Sair;");
            option = sc.nextInt();
            switch(option){
                case 7 -> {
                    setPetInPetMachine();
                }

            }
        } while (option != 0);
    }
    public static void setPetInPetMachine() {
        System.out.println("Informe o nome do pet:");
        var name = sc.nextLine();
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }
}
