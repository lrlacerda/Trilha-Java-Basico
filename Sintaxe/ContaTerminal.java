import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Solicitar informações ao usuário
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = terminal.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = terminal.nextInt();
        terminal.nextLine(); // Limpar o buffer do teclado após a leitura do número da conta

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = terminal.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = terminal.nextDouble();

        // Exibir informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        terminal.close();
    }
}
