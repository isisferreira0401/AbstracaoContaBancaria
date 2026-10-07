public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    @Override
    public double calcularTarifaMensal() {
        return 0.00;
    }
}
