    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.util.ArrayList;
import java.util.List;



/**
 * Classe que implementa operações CRUD para objetos do tipo Pessoa (Cliente ou Funcionário).
 *
 * @param <T> o tipo de pessoa, deve ser uma subclasse de Pessoa
 */
public class CRUDpessoas<T extends Pessoa> {
    private List<T> pessoas;

    /**
     * Construtor que inicializa a lista de pessoas.
     */
    public CRUDpessoas() {
        this.pessoas = new ArrayList<>();
    }

    /**
     * Adiciona uma pessoa à lista.
     *
     * @param pessoa a pessoa a ser adicionada
     */
    public void addPessoa(T pessoa) {
        pessoas.add(pessoa);
    }

    /**
     * Obtém uma pessoa da lista pelo CPF.
     *
     * @param cpf o CPF da pessoa a ser buscada
     * @return a pessoa encontrada, ou null se não encontrada
     */
    public T getPessoa(String cpf) {
        for (T pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    /**
     * Atualiza os dados de uma pessoa na lista.
     *
     * @param pessoa a pessoa com os dados atualizados
     */
    public void updatePessoa(T pessoa) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCpf().equals(pessoa.getCpf())) {
                pessoas.set(i, pessoa);
                return;
            }
        }
    }

    /**
     * Remove uma pessoa da lista pelo CPF.
     *
     * @param cpf o CPF da pessoa a ser removida
     */
    public void deletePessoa(String cpf) {
        pessoas.removeIf(pessoa -> pessoa.getCpf().equals(cpf));
    }

    /**
     * Obtém todas as pessoas da lista.
     *
     * @return uma lista contendo todas as pessoas
     */
    public List<T> getAllPessoas() {
        return new ArrayList<>(pessoas);
    }
}