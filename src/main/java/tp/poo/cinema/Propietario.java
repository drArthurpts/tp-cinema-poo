/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

/**
 * A classe {@code Propietario} representa um proprietário com atributos como nome, sobrenome, CPF, endereço, telefone,
 * nome de usuário e senha. Esta classe estende a classe {@code Pessoa}.
 */
public class Propietario extends Pessoa {

    /**
     * Construtor para a classe {@code Propietario} que inicializa os atributos nome, sobrenome, CPF, endereço, telefone,
     * nome de usuário e senha.
     * 
     * @param nome o nome do proprietário
     * @param sobrenome o sobrenome do proprietário
     * @param cpf o CPF do proprietário
     * @param endereco o endereço do proprietário
     * @param telefone o telefone do proprietário
     * @param nomeUsuario o nome de usuário do proprietário
     * @param senha a senha do proprietário
     */
    public Propietario(String nome, String sobrenome, String cpf, String endereco, String telefone, String nomeUsuario, String senha) {
        super(nome, sobrenome, cpf, endereco, telefone, nomeUsuario, senha);
    }

    /**
     * Retorna uma representação textual do objeto {@code Propietario}.
     * 
     * @return uma string representando o proprietário
     */
    @Override
    public String toString() {
        return "Proprietário: " + getNome() + ", CPF: " + getCpf() + ", Endereço: " + getEndereco() + ", Telefone: " + getTelefone() + ", Nome de usuário: " + getNomeUsuario();
    }
}
