public class Teste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 456);
        cc.deposita(1000);

        SeguroDeVida seguro = new SeguroDeVida();

        GerenciadorDeIR gerenciador = new GerenciadorDeIR();
        gerenciador.registra(cc);
        gerenciador.registra(seguro);

        System.out.println("Total de imposto: " + gerenciador.getTotal());
    }
}
