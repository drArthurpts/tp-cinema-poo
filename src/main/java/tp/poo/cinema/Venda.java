/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * Classe que representa uma venda.
 */
public class Venda {

    private Cliente cliente;
    private List<Produto> itensVendidos;
    private int quantIngressos;
    private Filme filme;
    private Balcao balcao;

    private double valorTotal;
    private LocalDateTime dataHora;
    private String extrato;
    private static final double PRECO_INGRESSO = 10.0; // Defina o preço do ingresso
    
    
    /**
     * Gera um extrato da venda.
     *
     * @return O extrato da venda.
     */
    public String gerarExtrato() {
        StringBuilder extrato = new StringBuilder();
        extrato.append("Cliente: ").append(cliente.getNome()).append("\n");
        extrato.append("Filme: ").append(filme.getTitulo()).append("\n");
        extrato.append("Balcão: ").append(balcao.getId()).append("\n");
        extrato.append("Quantidade de ingressos: ").append(quantIngressos).append("\n");
        extrato.append("Produtos: \n");

        double valorTotal = 0.0;
        for (Produto produto : itensVendidos) {
            double valorProduto = produto.getPreco() * produto.getQuantidade();
            extrato.append("- ").append(produto.getNome()).append(": R$ ").append(produto.getPreco()).append("\n");
            valorTotal += valorProduto;
        }

        // Supondo que o preço do ingresso seja uma constante
        double precoIngresso = 10.0;
        valorTotal += quantIngressos * precoIngresso;

        extrato.append("Valor total: R$ ").append(valorTotal);
        return extrato.toString();
    }
    
    
    /**
     * Retorna o cliente da venda.
     *
     * @return O cliente da venda.
     */
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }

    
     /**
     * Construtor para a classe Venda.
     *
     * @param cliente O cliente da venda.
     * @param balcao O balcão da venda.
     * @param produtoSelecionado O produto selecionado para a venda.
     * @param filme O filme da venda.
     * @param quantIngressos A quantidade de ingressos da venda.
     */
    public Venda(Cliente cliente, Balcao balcao, Produto produtoSelecionado, Filme filme, int quantIngressos) {
        this.cliente = cliente;
        this.itensVendidos = itensVendidos;
        this.filme = filme;
        this.balcao = balcao;
        this.quantIngressos = quantIngressos;
        this.dataHora = LocalDateTime.now();
    }

    public void adicionarItem(Produto produto) {
        itensVendidos.add(produto);
        extrato += "\n" + produto.getNome() + " - R$" + produto.getPreco();
    }
    
    
    /**
     * Calcula o total da venda.
     *
     * @return O total da venda.
     */
    public double calcularTotal() {
        valorTotal = 0.0;
        for (Produto p : itensVendidos) {
            valorTotal += p.getPreco() * p.getQuantidade();
        }
        return valorTotal;
    }

    public List<Produto> getItensVendidos() {
        return itensVendidos;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
    
    /**
     * Retorna a data da venda.
     *
     * @return A data da venda.
     */
    public LocalDateTime getData() {
        return dataHora;
    }

    public void setData(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Balcao getBalcao() {
        return balcao;
    }

    public void setBalcao(Balcao balcao) {
        this.balcao = balcao;
    }

    // Comparators
    public static Comparator<Venda> CompararPorValorTotal = new Comparator<Venda>() {
        public int compare(Venda v1, Venda v2) {
            return Double.compare(v1.getValorTotal(), v2.getValorTotal());
        }
    };
    
    public static Comparator<Venda> CompararPorDataHora = new Comparator<Venda>() {
        public int compare(Venda v1, Venda v2) {
            return v1.getDataHora().compareTo(v2.getDataHora());
        }
    };
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(cliente.getNome()).append("\n");
        sb.append("Filme: ").append(filme.getTitulo()).append("\n");
        sb.append("Balcão: ").append(balcao.getId()).append("\n");
        sb.append("Quantidade de ingressos: ").append(quantIngressos).append("\n");
        sb.append("Produtos: \n");

        for (Produto produto : itensVendidos) {
            sb.append("- ").append(produto.getNome()).append(": R$ ").append(produto.getPreco()).append("\n");
        }

        sb.append("Valor total: R$ ").append(valorTotal).append("\n");
        sb.append("Data e hora: ").append(dataHora).append("\n");
        return sb.toString();
    }

}
