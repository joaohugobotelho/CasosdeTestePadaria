package padaria.bridge;

public class PagamentoDinheiro implements TipoPagamento {

    @Override
    public float calcularTotal(float valorBase) {
        return valorBase * 0.9f; // 10% desconto de desconto no pagamento em dinheiro
    }
}