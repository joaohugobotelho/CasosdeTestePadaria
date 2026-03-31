package padaria.bridge;

public abstract class Venda {

    protected TipoPagamento tipoPagamento;
    protected float valorBase;

    public Venda(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularTotal();
}