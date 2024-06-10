/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.time.LocalDate;

/**
 * A classe {@code Produto} representa um produto com atributos como nome, preço, data de validade e quantidade.
 * Esta é uma classe abstrata que serve de base para outros tipos específicos de produtos.
 */
public abstract class Produto {

    protected String nome;
    protected Double preco;
    protected LocalDate DataValidade;
    protected int quantidade;

    /**
     * Construtor padrão para a classe {@code Produto}.
     */
    public Produto() {
        // Construtor vazio
    }

    /**
     * Construtor para a classe {@code Produto} que inicializa os atributos nome, data de validade e preço.
     * 
     * @param nome o nome do produto
     * @param DataValidade a data de validade do produto
     * @param preco o preço do produto
     */
    public Produto(String nome, LocalDate DataValidade, Double preco) {
        this.nome = nome;
        this.DataValidade = DataValidade;
        this.preco = preco;
        Cinema.incrementarProdutosPrivado();
    }

    /**
     * Obtém o nome do produto.
     * 
     * @return o nome do produto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     * 
     * @param nome o nome do produto
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o preço do produto.
     * 
     * @return o preço do produto
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto.
     * 
     * @param preco o preço do produto
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * Obtém a data de validade do produto.
     * 
     * @return a data de validade do produto
     */
    public LocalDate getDataValidade() {
        return DataValidade;
    }

    /**
     * Obtém a quantidade do produto.
     * 
     * @return a quantidade do produto
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade do produto.
     * 
     * @param quantidade a quantidade do produto
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Retorna uma representação textual do objeto {@code Produto}.
     * 
     * @return uma string representando o produto
     */
    @Override
    public String toString() {
        return "Produto{" + 
                "nome=" + nome + 
                ", preco=" + preco + 
                ", DataValidade=" + DataValidade + ", " +
                "quantidade=" + quantidade + 
                '}';
    }
}
