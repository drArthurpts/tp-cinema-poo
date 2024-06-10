/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A classe {@code GestaoFilmes} é responsável pela gestão de filmes em um sistema de cinema.
 * Permite adicionar filmes, obter a lista de filmes e selecionar um filme para assistir.
 */
public class GestaoFilmes {
    private List<Filme> filmes;
    private Scanner scanner = new Scanner(System.in);

    /**
     * Construtor padrão que inicializa a lista de filmes.
     */
    public GestaoFilmes() {
        this.filmes = new ArrayList<>();
    }

    /**
     * Adiciona um filme à lista de filmes.
     *
     * @param filme o filme a ser adicionado
     */
    public void adicionarFilme(Filme filme) {
        this.filmes.add(filme);
    }

    /**
     * Retorna a lista de filmes.
     *
     * @return a lista de filmes
     */
    public List<Filme> getFilmes() {
        return this.filmes;
    }

    /**
     * Permite ao usuário selecionar um filme da lista de filmes disponíveis.
     * O filme é selecionado com base no título informado pelo usuário.
     *
     * @return o filme selecionado, ou {@code null} se nenhum filme for encontrado
     */
    public Filme selecionarFilme() {
        System.out.println("Filmes disponíveis:");
        for (Filme filme : this.filmes) {
            System.out.println(filme.getTitulo());
        }
        System.out.println("Informe o filme que deseja assistir:");

        String filmeNome = scanner.nextLine();

        for (Filme filme : this.filmes) {
            if (filme.getTitulo().equalsIgnoreCase(filmeNome)) {
                System.out.println("Você selecionou: " + filme.getTitulo());
                return filme;
            }
        }

        System.out.println("Filme não encontrado.");
        return null;
    }

    /**
     * Retorna uma representação textual do objeto {@code GestaoFilmes}.
     *
     * @return uma string que representa o objeto {@code GestaoFilmes}
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GestaoFilmes{");
        sb.append("filmes=").append(filmes);
        sb.append('}');
        return sb.toString();
    }
}