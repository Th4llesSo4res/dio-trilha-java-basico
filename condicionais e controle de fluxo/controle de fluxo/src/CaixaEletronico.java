public class CaixaEletronico {
    public static void main(String[] args) {

        // Variavel
        double saldo = 25.0; 
        double valorSolicitado = 26.0;

        // Controle de
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        }
    }
}
