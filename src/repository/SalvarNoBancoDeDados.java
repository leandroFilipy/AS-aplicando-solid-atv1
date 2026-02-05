package repository;

import model.Pedido;

public class SalvarNoBancoDeDados {

    public void salvarNoBancoDeDados(Pedido pedido, double valorFinal) {
        System.out.println("Pedido "
                + pedido.getId() + " finalizado (Valor: R$" + valorFinal + ") e salvo no BD.");
    }
}
