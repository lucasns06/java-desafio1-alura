public class Desafio {
    public static void main(String[] args) {
        double saldo = 2500;
        String nome = "Lucas Nascimento";
        String dadosCliente =
                """
                
                Nome:           %s
                Tipo Conta:     Corrente
                Saldo Inicial:  R$ %.2f
                """.formatted(nome, saldo);

        System.out.println(dadosCliente);
    }
}
