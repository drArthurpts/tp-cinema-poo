/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um cliente do cinema.
 * Extende a classe Pessoa e possui preferências de filmes e produtos.
 */
public class Cliente extends Pessoa {

    private ArrayList<String> preferenciasFilmes;
    private ArrayList<String> preferenciasProdutos;

    // Questão 13
    // Contador de instâncias private
    private static int instanciaCount = 0;

    // Contador de instâncias utilizando protected
    protected static int clienteInstanciaCountProtected = 0;

    /**
     * Construtor padrão do Cliente.
     */
    public Cliente() {
        this.preferenciasFilmes = new ArrayList<>();
        this.preferenciasProdutos = new ArrayList<>();
    }

    /**
     * Construtor do Cliente com parâmetros.
     *
     * @param nome         o nome do cliente
     * @param sobrenome    o sobrenome do cliente
     * @param cpf          o CPF do cliente
     * @param endereco     o endereço do cliente
     * @param telefone     o telefone do cliente
     * @param nomeUsuario  o nome de usuário do cliente
     * @param senha        a senha do cliente
     */
    public Cliente(String nome, String sobrenome, String cpf, String endereco, String telefone, String nomeUsuario, String senha) {
        super(nome, sobrenome, cpf, endereco, telefone, nomeUsuario, senha);
        this.preferenciasFilmes = new ArrayList<>();
        this.preferenciasProdutos = new ArrayList<>();
        incrementarInstanciaCount();
        Cinema.incrementarClientesPrivado();
    }

    /**
     * Incrementa o contador de instâncias private.
     */
    private static void incrementarInstanciaCount() {
        instanciaCount++;
    }

    /**
     * Retorna o contador de instâncias private.
     *
     * @return o contador de instâncias private
     */
    public static int getInstanciaCount() {
        return instanciaCount;
    }

    /**
     * Define o contador de instâncias private.
     *
     * @param count o valor do contador de instâncias
     */
    public static void setInstanciaCount(int count) {
        instanciaCount = count;
    }

    /**
     * Incrementa o contador de instâncias protected.
     */
    private static void incrementarClienteInstanciaCountProtected() {
        clienteInstanciaCountProtected++;
    }

    /**
     * Retorna o contador de instâncias protected.
     *
     * @return o contador de instâncias protected
     */
    public static int getClienteInstanciaCountProtected() {
        return clienteInstanciaCountProtected;
    }

    /**
     * Adiciona uma preferência de filme ao cliente.
     *
     * @param filme o filme a ser adicionado às preferências
     */
    public void adicionarPreferenciaFilme(String filme) {
        preferenciasFilmes.add(filme);
    }

    /**
     * Adiciona uma preferência de produto ao cliente.
     *
     * @param produto o produto a ser adicionado às preferências
     */
    public void adicionarPreferenciaProduto(String produto) {
        preferenciasProdutos.add(produto);
    }

    /**
     * Define o nome do cliente.
     *
     * @param nome o nome do cliente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o nome do cliente.
     *
     * @return o nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o CPF do cliente.
     *
     * @return o CPF do cliente
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Retorna as preferências de filmes do cliente.
     *
     * @return a lista de preferências de filmes
     */
    public ArrayList<String> getPreferenciasFilmes() {
        return preferenciasFilmes;
    }

    /**
     * Define as preferências de filmes do cliente.
     *
     * @param preferenciasFilmes a lista de preferências de filmes
     */
    public void setPreferenciasFilmes(ArrayList<String> preferenciasFilmes) {
        this.preferenciasFilmes = preferenciasFilmes;
    }

    /**
     * Retorna as preferências de produtos do cliente.
     *
     * @return a lista de preferências de produtos
     */
    public ArrayList<String> getPreferenciasProdutos() {
        return preferenciasProdutos;
    }

    /**
     * Define as preferências de produtos do cliente.
     *
     * @param preferenciasProdutos a lista de preferências de produtos
     */
    public void setPreferenciasProdutos(ArrayList<String> preferenciasProdutos) {
        this.preferenciasProdutos = preferenciasProdutos;
    }

    /**
     * Retorna a representação textual do objeto Cliente.
     *
     * @return a string que representa o cliente
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", preferenciasFilmes=" + preferenciasFilmes +
                ", preferenciasProdutos=" + preferenciasProdutos +
                '}';
    }
}

