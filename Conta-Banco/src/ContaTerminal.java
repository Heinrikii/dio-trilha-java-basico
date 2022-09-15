import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner input = new Scanner(System.in);
        

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal

        System.out.println("Por Favor digite o número da Conta: ");
        int conta = input.nextInt();

        System.out.println("Por favor digite o número da sua Agência: ");
        String agencia = input.next();


        System.out.println("Por favor digite o seu nome: ");
        String nome = input.next();
        
       // System.out.println("Por favor digite o seu sobrenome: ");
        //String sobreNome = input.next();


        System.out.println("Informe o valor para deposito: ");
        double saldo = input.nextDouble();

        //Exibir a mensagem conta criada
        
        System.out.println("***********Comprovante de Abertura de conta******************");
        System.out.println("*************************************************************");
        System.out.println("**********||Nome: " + nome+"           \t\t||***********");
        System.out.println("**********||Agência: " + agencia+"     \t\t\t||***********");
        System.out.println("**********||Conta: " + conta+"         \t\t||***********");
        System.out.println("**********||Saldo: R$" +saldo+" reais  \t\t||***********");
        System.out.println("*************************************************************");
        System.out.println("*************************************************************");
        
        input.close();
    }
}