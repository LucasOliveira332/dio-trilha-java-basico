import Account.Account;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        


        System.out.print("Digite o número da conta: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Digite a agência: ");
        String agency = scanner.next();

        scanner.nextLine();
        System.out.print("Digite seu nome completo: ");
        String clientName = scanner.nextLine();

        System.out.print("Digite seu saldo inicial: ");
        double balance = scanner.nextDouble();

        scanner.close();

        Account account = new Account(accountNumber, agency, clientName, balance);


        account.displayDetails();
    }
}
