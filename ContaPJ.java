public class ContaPJ extends Conta{
    public ContaPJ(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double taxaSaque = 1.50;
        double valorTotal = valor + taxaSaque;

        if (valor > 0 && saldo >= valorTotal) {
            saldo -= valorTotal;
            System.out.printf("Saque de R$ %.2f (Taxa: R$ %.2f) realizado na Conta PJ %s.%n",
                    valor, taxaSaque, getNumero());
            return true;
        } else {
            IO.println("Saldo insuficiente para cobrir o saque e a taxa de R$ 1,50.");
            return false;
        }
    }

    @Override
    public double calcularTarifaMensal() {
        return 20.00;
    }
}
