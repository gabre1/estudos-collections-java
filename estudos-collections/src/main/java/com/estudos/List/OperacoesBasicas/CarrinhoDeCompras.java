package com.estudos.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nomeProd, double precoProd, int quantidadeProd){
       Item item = new Item(nomeProd, precoProd, quantidadeProd);
       this.carrinhoCompras.add(item);
    }

    public void removerItem(String nomeProd){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinhoCompras.isEmpty()) {
        for (Item i : carrinhoCompras) {
            if(i.getNomeProd().equalsIgnoreCase(nomeProd)){
                itensParaRemover.add(i);
            }
        }
        carrinhoCompras.removeAll(itensParaRemover);
    } else {
        System.out.println("A lista está vazia!");}}
    

    public double calcularValorTotal(){
        double valorTotal = 0;
        if(!carrinhoCompras.isEmpty()){
            for (Item i : carrinhoCompras) {
                double valorItem = i.getPrecoProd() * i.getQuantidadeProd();
                valorTotal += valorItem;
            }
        } else {
        System.out.println("Carrinho vazio.");
    }
    return valorTotal;
    }

    public void exibirItens(){
        if(!carrinhoCompras.isEmpty()){
            System.out.println(this.carrinhoCompras);
        } else {
            System.out.println("Carrinho vazio.");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Manteiga", 5.55, 2);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Coca", 9.54, 1);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Arroz", 7.31, 4);
        carrinhoDeCompras.exibirItens();
        System.out.println("Total das compras: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Manteiga");
        carrinhoDeCompras.exibirItens();
        System.out.println("Total das compras: " + carrinhoDeCompras.calcularValorTotal());
    }
}   


