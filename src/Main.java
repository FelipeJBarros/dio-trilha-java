import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Criando conta:");
        System.out.println("------");
        System.out.println("Digite seu nome:");
        String clientName = scanner.nextLine();
        System.out.println("Digite o número da conta");
        int accountNumber = scanner.nextInt();
        System.out.println("Digite a agência:");
        String agency = scanner.next();
        System.out.println("Digite o valor do deposito inicial:");
        double initialBalance = scanner.nextDouble();

        ContaTerminal account = new ContaTerminal(
                accountNumber,
                agency,
                clientName,
                initialBalance
        );

        System.out.println(account.toString());
    }
}