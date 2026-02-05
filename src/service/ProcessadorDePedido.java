package service;
import model.Pedido;
import model.Pedido.*;

public class ProcessadorDePedido {

    public double processar(Pedido pedido)
            throws Exception {
        if (pedido.getQuantidadeItens() > 100) {

            throw new Exception("Estoque insuficiente para a quantidade solicitada.");
        }
        double frete = 0.0;
        if (pedido.getValorTotal() < 500.00) {
            frete = 50.00;
        } else {
            frete = 0.0;
        }
        double impostos = pedido.getValorTotal() * 0.15;
        double valorFinal = pedido.getValorTotal() + frete + impostos;

        pedido.setPago(true);

        return valorFinal;
    }
}
