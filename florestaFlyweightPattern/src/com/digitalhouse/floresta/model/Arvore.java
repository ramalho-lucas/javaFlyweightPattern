package com.digitalhouse.floresta.model;

public class Arvore {
    private String tipo;
    private int altura;
    private int largura;
    private String cor;

    public static int contador;

    public Arvore(String tipo, int altura, int largura, String cor) {
        this.tipo = tipo;
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        contador++;
    }



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
