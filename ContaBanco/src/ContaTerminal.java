import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner dadosBancarios = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome");
        System.out.print("Nome: ");
        String nome = dadosBancarios.nextLine(); //nextLine para pegar nome completo do usuário
        
        System.out.println("Nos informe agora qual sua agência!");
        System.out.print("Agencia: ");
        String agencia = dadosBancarios.next();

        System.out.println("Precisamos do número da sua conta, nesta etapa.");
        System.out.print("Numero da Conta: ");
        int numeroConta = dadosBancarios.nextInt();
        
        System.out.println("finalizando, nos infomre o seu saldo bancário!");
        System.out.print("Saldo: ");
        double saldo = dadosBancarios.nextDouble();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");

        dadosBancarios.close(); //fecha a entrada de dados
    }
}
