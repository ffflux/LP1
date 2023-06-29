package model;

import repository.ExibirInterface;

public class Pedido extends Orcamento implements ExibirInterface {

    private String dataEntrega;
    private Boolean entrega = false;

    public Pedido(String dataEntrega) {
        this.dataEntrega = dataEntrega;
        entrega = false;
    }

    private void setData_entrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public void exibir(Boolean completo) {

    }
}

