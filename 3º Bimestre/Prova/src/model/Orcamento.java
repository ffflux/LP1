package model;


import repository.ExibirInterface;

import java.util.ArrayList;
import java.util.List;

public class Orcamento implements ExibirInterface {

    List<String> lista = new ArrayList<>();
    private static Long id_base;
    private Double valor_total;
    private Long id;

    public Orcamento() {
        this.id = id_base++;
    }

    public List<String> getLista() {
        return lista;
    }

    public static Long getId_base() {
        return id_base;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public Long getId() {
        return id;
    }

    @Override
    public void exibir(Boolean completo) {

    }
}

