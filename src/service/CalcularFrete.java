package service;

import model.Pedido;

public class CalcularFrete {

    double frete = 0.0;

    Pedido pedido = new Pedido();

    public double CalcularFrete(Pedido pedido){

        if (pedido.getValorTotal() < 500.00) {
            frete = 50.00;
        } else {
            frete = 0.0;
        }


        double impostos = pedido.getValorTotal() * 0.15;
        double valorFinal = pedido.getValorTotal() + frete + impostos;

        return valorFinal;


    }

}
