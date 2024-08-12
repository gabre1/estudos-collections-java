package com.estudos.List.OperacoesBasicas;

public class Item {
    private String nomeProd;
    private double precoProd;
    private int quantidadeProd;
    
    public Item(String nomeProd, double precoProd, int quantidadeProd) {
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
        this.quantidadeProd = quantidadeProd;
    }
    public String getNomeProd() {
        return nomeProd;
    }
    public double getPrecoProd() {
        return precoProd;
    }
    public int getQuantidadeProd() {
        return quantidadeProd;
    }
    @Override
    public String toString() {
        return "Produto: " + nomeProd + " Preço: " + precoProd + " Quantidade: " + quantidadeProd;
    }
    
    
}
