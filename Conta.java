public abstract class Conta {
    public String numero;
    public String titular;
    public double saldo;
    public String agencia;

    public Conta(String numero, String agencia, String titular, double saldoInicial) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso na conta %s.%n", valor, numero);
        } else {
            IO.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado na conta %s.%n", valor, numero);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
            return false;
        }
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s | Agência: %s | Conta: %s | Saldo Atual: R$ %.2f%n", titular, agencia, numero, saldo);
    }


    public abstract double calcularTarifaMensal();

    public String getNumero() { return numero; }
    public String getAgencia() { return agencia; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
}
