import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        Scanner scannerNome = new Scanner(System.in);
        System.out.println("Por favor, digite o nome completo do cliente: ");
        String nomeCliente = scannerNome.nextLine();

        System.out.println("Por favor, digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é [" + agencia + "], conta [" + numero + "] e seu saldo é [R$ " + saldo + "], já disponível para saque.");

        scanner.close();
        scannerNome.close();

    }
}
