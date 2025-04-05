import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 2500;
        String nome = "Lucas Nascimento";
        int opcao = 0;

        String dadosCliente =
                """
                
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo Conta:     Corrente
                Saldo Inicial:  R$ %.2f
                """.formatted(nome, saldo);

        String operacoes =
                """
                
                Operações
                
                1- Consultar Saldo
                2- Receber Valor
                3- Transferir Valor
                4- Sair
                
                """;

        System.out.println(dadosCliente);

        while (opcao != 4)
        {
            System.out.println(operacoes);
            System.out.print("Digite a opção desejada: ");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.printf("Saldo Atual: %.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para receber: ");
                    double valorRecebido = leitor.nextDouble();
                    saldo += valorRecebido;
                    System.out.printf("\nSaldo atualizado: %.2f\n", saldo);
                    break;
                case 3:
                    System.out.println("Um digitado uhul2");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
}
