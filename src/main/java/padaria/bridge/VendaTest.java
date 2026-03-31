package padaria.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendaTest {

    @Test
    public void deveAplicarDescontoDinheiro() {
        Venda venda = new VendaPadaria(100);
        venda.setTipoPagamento(new PagamentoDinheiro());

        float total = venda.calcularTotal();      // desconto de 10% aplicado ao pagamento em dinheiro

        System.out.println(total);
        
        assertEquals(90, venda.calcularTotal(), 0.01);
    }

    @Test
    public void naoDeveAplicarDescontoCartao() {
        Venda venda = new VendaPadaria(100);
        venda.setTipoPagamento(new PagamentoCartao());  // sem desconto ao realizar o pagamento no cartao

        assertEquals(100, venda.calcularTotal(), 0.01);
    }

    @Test
    public void deveRetornarZeroQuandoValorZero() {
        Venda venda = new VendaPadaria(0);
        venda.setTipoPagamento(new PagamentoCartao());

        assertEquals(0, venda.calcularTotal(), 0.01);
}
}