import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {

            System.out.println("Por favor, digite sua agência:");
        String agencia = scanner.next();

        System.out.println("Agora o número da sua conta:");
        int contaBanco = scanner.nextInt();

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo bancário:");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + contaBanco + " e seu saldo de " + saldoConta + " já está disponível para saque.");
            
        } finally {
            
            scanner.close();
        }

    }
}
