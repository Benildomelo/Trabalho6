public class GerenciadorDeIR {
    private double totalImposto = 0;

    public void registra(Tributavel t) {
        double valor = t.getValorTributavel();
        this.totalImposto += valor;
    }

    public double getTotal() {
        return this.totalImposto;
    }
}
