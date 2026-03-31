package padaria.bridge;

public class VendaPadaria extends Venda {

    public VendaPadaria(float valorBase) {
        super(valorBase);
    }

    @Override
    public float calcularTotal() {
        return tipoPagamento.calcularTotal(valorBase);
    }
}