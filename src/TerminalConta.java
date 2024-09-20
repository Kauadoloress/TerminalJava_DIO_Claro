import java.util.Scanner;

public class TerminalConta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        String nome = "Carlinhos";
        String agencia = "022-7";
        double saldoBancari = 15000;


        System.out.println("Digite seu número Báncario: ");
        numero = scan.nextInt();
        System.out.println("Usuário " + numero);
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é de R$" + saldoBancari + ", já está disponível pra saque");

    }
}
