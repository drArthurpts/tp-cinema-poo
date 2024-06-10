/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe {@code Login} gerencia o login de usuários e o cadastro de novos usuários.
 * 
 * Os usuários são armazenados em uma lista estática, e a classe fornece métodos
 * para adicionar novos usuários e realizar o login.
 */
public class Login {

    private static List<Pessoa> Usuarios = new ArrayList<>();

    /**
     * Construtor padrão para a classe {@code Login}.
     */
    public Login() {
        // Construtor vazio
    }

    /**
     * Adiciona um novo usuário à lista de usuários.
     * 
     * @param pessoa o objeto {@code Pessoa} a ser adicionado
     */
    public void adUsuario(Pessoa pessoa) {
        Usuarios.add(pessoa);
    }

    /**
     * Realiza o login com o nome de usuário e senha fornecidos.
     * 
     * @param nomeUsuario o nome de usuário
     * @param senha a senha
     * @return o objeto {@code Pessoa} correspondente ao usuário logado ou {@code null} se as credenciais estiverem incorretas
     */
    public Pessoa login(String nomeUsuario, String senha) {
        for (Pessoa pessoa : Usuarios) {
            if (pessoa.getNomeUsuario().equals(nomeUsuario) && pessoa.verificarSenha(senha)) {
                if (pessoa instanceof Propietario) {
                    System.out.println("Propietário logado com sucesso!");
                    System.out.println("--------------------------------------------------");
                } else if (pessoa instanceof Funcionario) {
                    System.out.println("Funcionário logado com sucesso!");
                    System.out.println("--------------------------------------------------");
                }
                return pessoa;
            }
        }
        return null;
    }

    /**
     * Retorna uma representação textual dos usuários cadastrados.
     * 
     * @return uma string contendo os usuários cadastrados
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuários cadastrados:\n");
        for (Pessoa pessoa : Usuarios) {
            sb.append(pessoa).append("\n");
        }
        return sb.toString();
    }
}
   

