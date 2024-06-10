/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um extrato de venda.
 * Contém informações sobre o cliente, itens vendidos e valor total da venda.
 */
public class ExtratoVenda {
    private Cliente cliente;
    private List<ItemVenda> itensVendidos;
    private double valorTotal;

    /**
     * Construtor padrão do ExtratoVenda.
     * Inicializa a lista de itens vendidos e o valor total como zero.
     */
    public ExtratoVenda() {
        this.itensVendidos = new ArrayList<>();
        this.valorTotal = 0;
    }
    
    /**
     * Construtor do ExtratoVenda com parâmetros.
     *
     * @param cliente o cliente relacionado à venda
     */
    public ExtratoVenda(Cliente cliente) {
        this.cliente = cliente;
        this.itensVendidos = new ArrayList<>();
        this.valorTotal = 0;
    }

    /**
     * Adiciona um item vendido ao extrato de venda.
     *
     * @param item o item vendido a ser adicionado
     */
    public void adicionarItemVenda(ItemVenda item) {
        itensVendidos.add(item);
        valorTotal += item.getValorTotal();
    }

    /**
     * Imprime o extrato de venda no console.
     */
    public void imprimirExtrato() {
        System.out.println("===== Extrato de Venda =====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Itens Vendidos:");

        for (ItemVenda item : itensVendidos) {
            System.out.println("- " + item.getDescricao() + ": " + item.getQuantidade() + " x " + item.getValorUnitario() + " = R$ " + item.getValorTotal());
        }

        System.out.println("Valor Total: R$ " + valorTotal);
        System.out.println("============================");
    }

    /**
     * Retorna o valor total da venda.
     *
     * @return o valor total da venda
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * Retorna uma representação textual do extrato de venda.
     *
     * @return a string que representa o extrato de venda
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== Extrato de Venda =====\n");
        sb.append("Cliente: ").append(cliente.getNome()).append("\n");
        sb.append("CPF: ").append(cliente.getCpf()).append("\n");
        sb.append("Itens Vendidos:\n");

        for (ItemVenda item : itensVendidos) {
            sb.append("- ").append(item.getDescricao()).append(": ")
              .append(item.getQuantidade()).append(" x ").append(item.getValorUnitario())
              .append(" = R$ ").append(item.getValorTotal()).append("\n");
        }

        sb.append("Valor Total: R$ ").append(valorTotal).append("\n");
        sb.append("============================\n");

        return sb.toString();
    }
}