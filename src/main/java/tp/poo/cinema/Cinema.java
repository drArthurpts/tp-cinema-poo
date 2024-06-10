/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um cinema, com funcionalidades para cadastrar e gerenciar clientes,
 * funcionários, produtos, vendas e balcões.
 */
public class Cinema {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Filme> filmes = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private List<Venda> vendas = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private static List<Balcao> balcoes = new ArrayList<>();
    private static List<ExtratoVenda> extratos = new ArrayList<>();
    private static int quantidadeClientesPrivado = 0;
    private static int quantidadeProdutosPrivado = 0;

    /**
     * Retorna a quantidade de clientes privados cadastrados.
     *
     * @return a quantidade de clientes privados cadastrados
     */
    public static int getQuantidadeClientesPrivado() {
        return quantidadeClientesPrivado;
    }

    /**
     * Define a quantidade de clientes privados cadastrados.
     *
     * @param quantidade a quantidade de clientes privados
     */
    private static void setQuantidadeClientesPrivado(int quantidade) {
        quantidadeClientesPrivado = quantidade;
    }

    /**
     * Incrementa a quantidade de clientes privados cadastrados.
     */
    public static void incrementarClientesPrivado() {
        setQuantidadeClientesPrivado(getQuantidadeClientesPrivado() + 1);
    }

    /**
     * Retorna a quantidade de produtos privados cadastrados.
     *
     * @return a quantidade de produtos privados cadastrados
     */
    public static int getQuantidadeProdutosPrivado() {
        return quantidadeProdutosPrivado;
    }

    /**
     * Define a quantidade de produtos privados cadastrados.
     *
     * @param quantidade a quantidade de produtos privados
     */
    private static void setQuantidadeProdutosPrivado(int quantidade) {
        quantidadeProdutosPrivado = quantidade;
    }

    /**
     * Incrementa a quantidade de produtos privados cadastrados.
     */
    public static void incrementarProdutosPrivado() {
        setQuantidadeProdutosPrivado(getQuantidadeProdutosPrivado() + 1);
    }

    /**
     * Retorna quantas instâncias foram criadas de Cliente e Produto.
     *
     * @return uma string com a quantidade de clientes e produtos
     */
    public static String obterQuantidadeInstancias() {
        return "Quantidade de Clientes: " + getQuantidadeClientesPrivado() + "\n" +
               "Quantidade de Produtos: " + getQuantidadeProdutosPrivado();
    }

    /**
     * Cadastra uma nova venda.
     *
     * @param venda a venda a ser cadastrada
     */
    public void cadastrarVenda(Venda venda) {
        vendas.add(venda);
    }

    /**
     * Retorna a lista de vendas cadastradas.
     *
     * @return a lista de vendas cadastradas
     */
    public List<Venda> imprimirListaVenda() {
        return vendas;
    }

    /**
     * Cadastra um novo cliente.
     *
     * @param cliente o cliente a ser cadastrado
     */
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    /**
     * Retorna a lista de clientes cadastrados.
     *
     * @return a lista de clientes cadastrados
     */
    public List<Cliente> imprimirListaCliente() {
        return clientes;
    }

    /**
     * Cadastra um novo funcionário.
     *
     * @param funcionario o funcionário a ser cadastrado
     */
    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    /**
     * Retorna a lista de funcionários cadastrados.
     *
     * @return a lista de funcionários cadastrados
     */
    public List<Funcionario> imprimirListaFuncionario() {
        return funcionarios;
    }

    /**
     * Cadastra um novo produto.
     *
     * @param produto o produto a ser cadastrado
     */
    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    /**
     * Retorna a lista de produtos cadastrados.
     *
     * @return a lista de produtos cadastrados
     */
    public List<Produto> imprimirListaProduto() {
        return produtos;
    }

    /**
     * Inicializa os balcões do cinema. Quatro automatizados e um manual.
     */
    static {
        for (int i = 1; i <= 4; i++) {
            balcoes.add(new Balcao(i, true)); // Balcões automatizados
        }
        balcoes.add(new Balcao(5, false)); // Balcão manual
    }

    /**
     * Seleciona um balcão com base na preferência do usuário.
     *
     * @param preferenciaAutomatizado se o usuário prefere um balcão automatizado
     * @return o balcão selecionado ou null se não houver correspondência
     */
    public Balcao escolherBalcao(boolean preferenciaAutomatizado) {
        for (Balcao b : balcoes) {
            if (b.isAutomatizado() == preferenciaAutomatizado) {
                return b;
            }
        }
        return null;
    }

    /**
     * Construtor padrão para a classe Cinema.
     * Inicializa o cinema, cadastro de funcionários, etc.
     */
    public Cinema() {
        // Inicialização do cinema, cadastro de funcionários, etc.
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "produtos=" + produtos +
                ", filmes=" + filmes +
                ", clientes=" + clientes +
                ", vendas=" + vendas +
                '}';
    }
}
