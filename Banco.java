import java.sql.SQLOutput;
import java.util.Scanner;

public class Banco {
    static void main(String[] args) {

        // Cria o leitor de dados e define o saldo inicial e a opção do menu.
        Scanner leitor = new Scanner(System.in);
        double saldo = 1000;
        int opcoes = 0;

        // Dá boas-vindas ao cliente e solicita seu nome e sobrenome.
        System.out.println("Bem vindo ao Banco Barbosa");
        System.out.println("Nome e Sobrenome, por favor.");
        String nome = leitor.next();
        String sobrenome = leitor.next();
        System.out.println("Olá, " + nome + " " + sobrenome);

        // Exibe o saldo e solicita o tipo de conta do cliente.
        System.out.println("Seu Saldo $" + saldo);
        System.out.println("Tipo de conta? Corrente ou Poupança ");
        String tipodeConta = leitor.next();
        System.out.println("Conta: " + tipodeConta);

        // Exibe o menu de operações até o cliente escolher sair.
        while(opcoes != 4) {
            System.out.println("1.Depositar");
            System.out.println("2.Transferir");
            System.out.println("3.Saque");
            System.out.println("4.Sair");
            System.out.println("Escolha uma opção: ");
            opcoes = leitor.nextInt();

            // Pergunta o valor do depósito e atualiza o saldo.
            if (opcoes ==1) {
                System.out.println("Quanto você deseja depositar?");
                double deposito = leitor.nextDouble();
                saldo+=deposito;
            }
            //Pergunta o valor da transferência e verifica se há saldo suficiente.
            //Se houver, desconta o valor; caso contrário, exibe uma mensagem.
            else if (opcoes ==2) {
                System.out.println("Quanto você deseja transferir?");
                double transferir = leitor.nextDouble();
                if (saldo < transferir) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else{ saldo -= transferir; }
            }

            // Pergunta o valor do saque e verifica se há saldo suficiente.
            // Se houver, desconta o valor; caso contrário, exibe uma mensagem.
            else if(opcoes ==3) {
                System.out.println("Quanto você deseja sacar?");
                double sacar = leitor.nextDouble();
                if (saldo < sacar) {
                    System.out.println("Não há saldo para realizar o saque.");
                } else { saldo-=sacar; }
            }
            // Exibe uma mensagem quando o cliente sai do banco.
            else if (opcoes == 4) {
                System.out.println( nome + " " + sobrenome + " saiu do banco.");
            }
            // Exibe uma mensagem de erro para uma opção inválida.
             else {
                System.out.println(nome + " " + "opção invalida");
            }
             // Atualiza e exibe o saldo após uma operação.
             if (opcoes >=1 && opcoes <=3){
                 System.out.println(nome + " " + sobrenome + " Seu saldo é R$" + saldo);
             }
        }
    }
}
