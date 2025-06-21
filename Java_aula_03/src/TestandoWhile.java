public class TestandoWhile{
    public Scanner sc = new Scanner();
    for(;;){
        System.out.println("Digite um nome: ");
        var name = sc.nextLine();
        if(name.equalsIgnoreCase("exit")) break;
        System.out.println(name);
    }
    public String name = "";
    do{
        System.out.println("Informe um nome: ");
        name = sc.nextLine();
        System.out.println(name);
    } while(!name.equalsIgnoreCase("exit"));
    sc.close();
}