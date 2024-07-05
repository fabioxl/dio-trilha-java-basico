import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Inicializa o scanner para obter valores do terminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);       

        // Solicita e obtém o nome do usuário
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        // Solicita e obtém a agência do usuário
        System.out.println("Digite sua agência:");
        String agencia = scanner.next();

        // Solicita e obtém o número da conta do usuário
        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        // Solicita e obtém o saldo da conta do usuário
        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem de conta criada com os detalhes fornecidos
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
                           + agencia + ", conta número " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fecha o scanner
        scanner.close();
    }
}
