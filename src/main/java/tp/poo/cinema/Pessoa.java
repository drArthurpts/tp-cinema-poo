/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

/**
 * A classe {@code Pessoa} representa uma pessoa com atributos comuns como nome, sobrenome, CPF, endereço, telefone,
 * nome de usuário e senha. Esta é uma classe abstrata que serve de base para outras classes que representam tipos
 * específicos de pessoas.
 */
public abstract class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    protected String nomeUsuario;
    protected String senha;

    /**
     * Construtor padrão para a classe {@code Pessoa}.
     */
    public Pessoa() {
        // Construtor vazio
    }

    /**
     * Construtor para a classe {@code Pessoa} que inicializa todos os atributos.
     * 
     * @param nome o nome da pessoa
     * @param sobrenome o sobrenome da pessoa
     * @param cpf o CPF da pessoa
     * @param endereco o endereço da pessoa
     * @param telefone o telefone da pessoa
     * @param nomeUsuario o nome de usuário da pessoa
     * @param senha a senha da pessoa
     */
    public Pessoa(String nome, String sobrenome, String cpf, String endereco, String telefone, String nomeUsuario, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    /**
     * Obtém o nome da pessoa.
     * 
     * @return o nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     * 
     * @param nome o nome da pessoa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF da pessoa.
     * 
     * @return o CPF da pessoa
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF da pessoa.
     * 
     * @param cpf o CPF da pessoa
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o sobrenome da pessoa.
     * 
     * @return o sobrenome da pessoa
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Define o sobrenome da pessoa.
     * 
     * @param sobrenome o sobrenome da pessoa
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Obtém o endereço da pessoa.
     * 
     * @return o endereço da pessoa
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço da pessoa.
     * 
     * @param endereco o endereço da pessoa
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o telefone da pessoa.
     * 
     * @return o telefone da pessoa
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone da pessoa.
     * 
     * @param telefone o telefone da pessoa
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o nome de usuário da pessoa.
     * 
     * @return o nome de usuário da pessoa
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * Define o nome de usuário da pessoa.
     * 
     * @param nomeUsuario o nome de usuário da pessoa
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    /**
     * Obtém a senha da pessoa.
     * 
     * @return a senha da pessoa
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha da pessoa.
     * 
     * @param senha a senha da pessoa
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Verifica se a senha fornecida corresponde à senha da pessoa.
     * 
     * @param senhaDigitada a senha a ser verificada
     * @return {@code true} se a senha corresponder, caso contrário, {@code false}
     */
    public boolean verificarSenha(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }

    /**
     * Retorna uma representação textual do objeto {@code Pessoa}.
     * 
     * @return uma string representando a pessoa
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}