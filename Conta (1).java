public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
