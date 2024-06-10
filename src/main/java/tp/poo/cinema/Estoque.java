/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.time.LocalDate;

/**
 * Classe que representa o estoque de produtos de um cinema.
 * Permite adicionar, remover, listar produtos e verificar suas validades.
 */
public class Estoque {

    private List<Produto> produtos;

    /**
     * Construtor que inicializa a lista de produtos.
     */
    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    /**
     * Adiciona um produto ao estoque.
     *
     * @param produto o produto a ser adicionado
     */
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    /**
     * Remove um produto do estoque pelo nome.
     *
     * @param nomeProduto o nome do produto a ser removido
     */
    public void removerProduto(String nomeProduto) {
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                iterator.remove();
                System.out.println("Produto removido: " + produto.getNome());
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    /**
     * Lista todos os produtos do estoque.
     */
    public void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }

    /**
     * Verifica a validade de todos os produtos do estoque e imprime mensagens
     * indicando se estão dentro da validade ou vencidos.
     */
    public void verificarValidadeProdutos() {
        LocalDate dataAtual = LocalDate.now();
        for (Produto produto : produtos) {
            LocalDate dataValidadeProduto = produto.getDataValidade();
            if (dataValidadeProduto.isBefore(dataAtual)) {
                System.out.println("O produto " + produto.getNome() + " está vencido!");
                System.out.println("--------------------------------------------------");
            } else {
                System.out.println("O produto " + produto.getNome() + " está dentro da validade!");
                System.out.println("--------------------------------------------------");
            }
        }
    }

    /**
     * Retorna a lista de produtos do estoque.
     *
     * @return a lista de produtos
     */
    public List<Produto> getProduto() {
        return produtos;
    }
}