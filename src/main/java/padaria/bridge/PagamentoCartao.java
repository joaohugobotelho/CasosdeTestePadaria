package padaria.bridge;

public class PagamentoCartao implements TipoPagamento {

    @Override
    public float calcularTotal(float valorBase) {
        return valorBase; // sem desconto
    }
}