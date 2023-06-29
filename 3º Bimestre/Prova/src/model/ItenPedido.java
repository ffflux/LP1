package model;

public class ItenPedido {

    private String peca;
    private String modelo;
    private String tamanho;
    private Double valor;
    private static Long id_base;

    public ItenPedido(String peca, String modelo, String tamanho, Double valor) {
        this.peca = peca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.valor = valor;
        this.id = id_base++;
    }

    public String getPeca() {
        return peca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getValor() {
        return valor;
    }

    public static long getId_base() {
        return id_base;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setValor(double valor) {
        this.valor = valor;}

}
