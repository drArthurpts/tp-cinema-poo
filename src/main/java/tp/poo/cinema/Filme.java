/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

/**
 * A classe {@code Filme} representa um filme em um cinema.
 * Ela contém informações sobre o título, estilo, duração, prazo de exibição, e preço do filme.
 * Também mantém um registro do número total de visualizações por filme e do total de pessoas que assistiram aos filmes.
 */
public class Filme {
    /**
     * Contador total de pessoas que assistiram aos filmes.
     */
    public static int totalPessoas = 0;

    /**
     * Mapa que armazena o número de visualizações por filme.
     */
    public static Map<String, Integer> visualizacoesPorFilme = new HashMap<>();

    private String titulo;
    private String estilo;
    private Funcionario f;
    private String duracao;
    private String prazoExibicao;
    private double preco = 10; 

    /**
     * Retorna o preço do filme.
     * 
     * @return o preço do filme
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do filme.
     * 
     * @param preco o novo preço do filme
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Construtor padrão da classe {@code Filme}.
     */
    public Filme() {
        // Construtor padrão
    }

    /**
     * Construtor da classe {@code Filme} que inicializa o título e o estilo do filme.
     * Também incrementa o contador total de pessoas e atualiza o mapa de visualizações por filme.
     * 
     * @param titulo o título do filme
     * @param estilo o estilo do filme
     */
    public Filme(String titulo, String estilo) {
        this.titulo = titulo;
        this.estilo = estilo;
        totalPessoas++;
        visualizacoesPorFilme.put(titulo, visualizacoesPorFilme.getOrDefault(titulo, 0) + 1);
    }

    /**
     * Retorna o título do filme.
     * 
     * @return o título do filme
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Retorna o estilo do filme.
     * 
     * @return o estilo do filme
     */
    public String getEstilo() {
        return estilo;
    }

    /**
     * Comparador para ordenar filmes por gênero.
     */
    public static Comparator<Filme> CompararPorGenero = new Comparator<Filme>() {
        public int compare(Filme f1, Filme f2) {
            return f1.getEstilo().compareTo(f2.getEstilo());
        }
    };

    /**
     * Comparador para ordenar filmes por preço.
     */
    public static Comparator<Filme> CompararPorPreco = new Comparator<Filme>() {
        public int compare(Filme f1, Filme f2) {
            return Double.compare(f1.getPreco(), f2.getPreco());
        }
    };

    /**
     * Retorna uma representação textual do filme.
     * 
     * @return uma string que representa o filme
     */
    @Override
    public String toString() {
        return "Filme{" +
                "título='" + titulo + '\'' +
                ", estilo='" + estilo + '\'' +
                '}';
    }
}
