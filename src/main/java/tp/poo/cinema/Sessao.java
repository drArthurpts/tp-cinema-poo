/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * A classe {@code Sessao} representa uma sessão de exibição de filmes em um cinema.
 * Cada sessão possui uma lista de salas, uma lista de filmes em cartaz e uma lista de horários disponíveis.
 */
public class Sessao {

    private final Sala[] salas = new Sala[5]; // Array de salas para a sessão
    private List<Filme> filmes = new ArrayList<>(); // Lista de filmes em cartaz na sessão
    private List<LocalDate> horario; // Lista de horários disponíveis para a sessão
    private Scanner scanner; // Scanner para entrada de dados

    /**
     * Obtém a lista de salas disponíveis para a sessão.
     * 
     * @return a lista de salas
     */
    public Sala[] getSala() {
        return salas;
    }

    /**
     * Obtém a lista de filmes em cartaz na sessão.
     * 
     * @return a lista de filmes em cartaz
     */
    public List<Filme> getFilmes() {
        return filmes;
    }

    /**
     * Define a lista de filmes em cartaz na sessão.
     * 
     * @param filmes a lista de filmes em cartaz
     */
    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    /**
     * Obtém a lista de horários disponíveis para a sessão.
     * 
     * @return a lista de horários disponíveis
     */
    public List<LocalDate> getHorario() {
        return horario;
    }

    /**
     * Define a lista de horários disponíveis para a sessão.
     * 
     * @param horario a lista de horários disponíveis
     */
    public void setHorario(List<LocalDate> horario) {
        this.horario = horario;
    }

    /**
     * Construtor padrão para a classe {@code Sessao}.
     */
    public Sessao() {
        this.scanner = new Scanner(System.in);  // Inicializa o scanner uma vez
    }

    /**
     * Retorna uma representação textual da sessão, incluindo os filmes em cartaz e os horários disponíveis.
     * 
     * @return uma string representando a sessão
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sessão:\n");
        sb.append("Filmes em cartaz:\n");
        for (Filme filme : filmes) {
            sb.append(filme.getTitulo()).append("\n");
        }
        sb.append("Horários disponíveis:\n");
        if (horario != null) {
            for (LocalDate data : horario) {
                sb.append(data).append("\n");
            }
        }
        return sb.toString();
    }

}