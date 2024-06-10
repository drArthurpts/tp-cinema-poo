/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe que representa um carrinho de compras no cinema, permitindo a seleção de produtos,
 * ingressos, filmes e balcões.
 */
public class Carrinho {

    private Balcao balcao;
    private List<Produto> produto;
    private Estoque estoque;
    private Scanner scanner;
    private Sala[] salas;
    private Sala sala;
    private Assento[][] assentos;
    private int selecao;
    private int ingressos;
    private List<Sessao> sessao;
    private Cinema cinema;
    double total;

    /**
     * Define a seleção atual.
     *
     * @param selecao o valor da seleção
     */
    public void setSelecao(int selecao) {
        this.selecao = selecao;
    }

    /**
     * Retorna o array de salas.
     *
     * @return o array de salas
     */
    public Sala[] getSalas() {
        return salas;
    }

    /**
     * Define o array de salas.
     *
     * @param salas o array de salas
     */
    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

    /**
     * Retorna a lista de produtos.
     *
     * @return a lista de produtos
     */
    public List<Produto> getProduto() {
        return produto;
    }

    /**
     * Define a lista de produtos.
     *
     * @param produto a lista de produtos
     */
    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    /**
     * Retorna a lista de sessões.
     *
     * @return a lista de sessões
     */
    public List<Sessao> getSessao() {
        return sessao;
    }

    /**
     * Define a lista de sessões.
     *
     * @param sessao a lista de sessões
     */
    public void setSessao(List<Sessao> sessao) {
        this.sessao = sessao;
    }

    /**
     * Construtor que inicializa um carrinho com uma sala específica.
     *
     * @param sala a sala associada ao carrinho
     */
    public Carrinho(Sala sala) {
        this.sala = sala;
    }

    /**
     * Construtor padrão que inicializa o scanner.
     */
    public Carrinho() {
        this.scanner = new Scanner(System.in); // Inicializa o scanner uma vez
    }

    /**
     * Construtor que inicializa um carrinho com um estoque específico.
     *
     * @param estoque o estoque associado ao carrinho
     */
    public Carrinho(Estoque estoque) {
        this.estoque = estoque;
        this.produto = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Construtor que inicializa um carrinho com listas de produtos e sessões específicas.
     *
     * @param produto a lista de produtos
     * @param sessao  a lista de sessões
     */
    public Carrinho(List<Produto> produto, List<Sessao> sessao) {
        this.produto = produto;
        this.sessao = sessao;
    }

    /**
     * Seleciona um balcão no cinema com base na escolha do usuário.
     *
     * @param cinema o cinema onde o balcão será selecionado
     * @param total  o valor total da venda
     * @return o balcão selecionado
     */
    public Balcao selecionarBalcao(Cinema cinema, double total) {
        System.out.println("Escolha o tipo de balcão (1 para automatizado, 2 para manual):");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        Balcao balcaoSelecionado = null;
        if (escolha == 1) {
            balcaoSelecionado = cinema.escolherBalcao(true); // Automatizado
        } else if (escolha == 2) {
            balcaoSelecionado = cinema.escolherBalcao(false); // Manual
        } else {
            System.out.println("Opção inválida. Venda cancelada.");
        }

        if (balcaoSelecionado != null) {
            balcaoSelecionado.adicionarVenda(total);
        }
        return balcaoSelecionado;
    }

    /**
     * Seleciona um produto do estoque.
     *
     * @param estoque o estoque de onde o produto será selecionado
     * @return o produto selecionado
     */
    public Produto selecionarProduto(Estoque estoque) {
        System.out.println("Produtos disponíveis: ");
        estoque.listarProdutos();
        System.out.println("\nInforme o produto que deseja:");
        String selecionaProduto = scanner.nextLine();

        for (Produto produto : estoque.getProduto()) {
            if (produto.getNome().equalsIgnoreCase(selecionaProduto)) {
                System.out.println("Você selecionou: " + produto.getNome());
                selecionarQuantProduto();
                return produto;
            }
        }
        System.out.println("Produto não encontrado.");
        return null;
    }

    /**
     * Seleciona a quantidade de um produto.
     *
     * @return a quantidade selecionada
     */
    public int selecionarQuantProduto() {
        System.out.println("Informe a quantidade desejada desse produto");
        selecao = Integer.parseInt(scanner.nextLine());
        System.out.println("Você selecionou: " + selecao + " produto(s)");
        return selecao;
    }

    /**
     * Seleciona a quantidade de ingressos.
     *
     * @return a quantidade de ingressos selecionada
     */
    public int selecionarQuantIngressos() {
        System.out.println("Informe quantos ingressos deseja comprar:");
        ingressos = Integer.parseInt(scanner.nextLine());
        System.out.println("Você selecionou " + ingressos + " ingressos.");
        return ingressos; // Retorna a quantidade de ingressos
    }

    /**
     * Seleciona um filme da lista de filmes disponíveis.
     *
     * @param gestao a gestão de filmes onde o filme será selecionado
     * @return o filme selecionado
     */
    public Filme selecionarFilme(GestaoFilmes gestao) {
        System.out.println("Filmes disponíveis:");
        for (Filme filme : gestao.getFilmes()) {
            System.out.println(filme.getTitulo());
        }
        System.out.println("Informe o filme que deseja assistir:");
        String filmeNome = scanner.nextLine();

        for (Filme filme : gestao.getFilmes()) {
            if (filme.getTitulo().equalsIgnoreCase(filmeNome)) {
                System.out.println("Você selecionou: " + filme.getTitulo());
                return filme; // Retorna o filme selecionado
            }
        }

        System.out.println("Filme não encontrado.");
        return null;
    }

    /**
     * Retorna a seleção atual.
     *
     * @return a seleção atual
     */
    public int getSelecao() {
        return selecao;
    }

    /**
     * Retorna a quantidade de ingressos selecionada.
     *
     * @return a quantidade de ingressos
     */
    public int getIngressos() {
        return ingressos;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "balcao=" + balcao +
                ", produto=" + produto +
                ", estoque=" + estoque +
                ", sala=" + sala +
                ", selecao=" + selecao +
                ", ingressos=" + ingressos +
                ", sessao=" + sessao +
                ", cinema=" + cinema +
                ", total=" + total +
                '}';
    }
}