/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

/**
 * A classe {@code ItemVenda} representa um item de venda, contendo informações
 * sobre a descrição do item, valor unitário, quantidade e o valor total.
 */
public class ItemVenda {
    
    private String descricao;
    private double valorUnitario;
    private int quantidade;
    
    /**
     * Construtor que inicializa um item de venda com a descrição, valor unitário e quantidade.
     *
     * @param descricao a descrição do item
     * @param valorUnitario o valor unitário do item
     * @param quantidade a quantidade do item
     */
    public ItemVenda(String descricao, double valorUnitario, int quantidade) {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    /**
     * Retorna a descrição do item.
     *
     * @return a descrição do item
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Retorna o valor unitário do item.
     *
     * @return o valor unitário do item
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Retorna a quantidade do item.
     *
     * @return a quantidade do item
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Calcula e retorna o valor total do item com base no valor unitário e quantidade.
     *
     * @return o valor total do item
     */
    public double getValorTotal() {
        return valorUnitario * quantidade;
    }
    
    /**
     * Retorna uma representação textual do objeto {@code ItemVenda}.
     *
     * @return uma string que representa o objeto {@code ItemVenda}
     */
    @Override
    public String toString() {
        return "ItemVenda{" +
                "descricao='" + descricao + '\'' +
                ", valorUnitario=" + valorUnitario +
                ", quantidade=" + quantidade +
                ", valorTotal=" + getValorTotal() +
                '}';
    }
}
