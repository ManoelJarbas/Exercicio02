import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println("O número digitado foi: ");
        System.out.println(numero);
        sc.close();
    }
}
