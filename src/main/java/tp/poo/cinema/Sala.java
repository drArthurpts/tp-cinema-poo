/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.util.Scanner;


/**
 * A classe {@code Sala} representa uma sala de cinema com assentos que podem ser reservados.
 * Cada sala possui uma matriz de assentos e um carrinho de compras associado para selecionar ingressos.
 */
public class Sala {

    private Assento[][] assentos;
    private Carrinho carrinho;

    /**
     * Construtor padrão para a classe {@code Sala}.
     */
    public Sala() {
    }

    /**
     * Construtor para a classe {@code Sala} que inicializa a sala com uma matriz de assentos de tamanho especificado.
     * 
     * @param linhas  o número de linhas de assentos na sala
     * @param colunas o número de colunas de assentos na sala
     */
    public Sala(int linhas, int colunas) {
        this.carrinho = new Carrinho();
        this.assentos = new Assento[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                assentos[i][j] = new Assento();
            }
        }
    }

    /**
     * Mostra o estado atual dos assentos na sala, onde 'O' representa um assento disponível e 'X' representa um assento reservado.
     */
    public void mostrarAssentos() {
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                System.out.print(assentos[i][j].isReservado() ? "X " : "O ");
            }
            System.out.println();
        }
    }

    Scanner scanner = new Scanner(System.in);

    /**
     * Permite ao usuário reservar um número especificado de assentos, solicitando a linha e a coluna de cada assento.
     */
    public void reservarAssentos() {
        int numAssentos = this.carrinho.selecionarQuantIngressos();

        for (int i = 0; i < numAssentos; i++) {
            System.out.println("Digite a linha do assento " + (i + 1) + " que você deseja reservar:");
            int linha = scanner.nextInt();

            System.out.println("Digite a coluna do assento " + (i + 1) + " que você deseja reservar:");
            int coluna = scanner.nextInt();

            if (linha >= 0 && linha < assentos.length && coluna >= 0 && coluna < assentos[0].length) {
                if (!assentos[linha][coluna].isReservado()) {
                    assentos[linha][coluna].reservar();
                    System.out.println("Assento " + (i + 1) + " reservado com sucesso.");
                } else {
                    System.out.println("Assento " + (i + 1) + " já está reservado.");
                }
            } else {
                System.out.println("Linha ou coluna inválida para o assento " + (i + 1) + ".");
            }
        }
    }

    /**
     * Retorna uma representação textual do estado atual dos assentos na sala.
     * 
     * @return uma string representando os assentos da sala
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Assentos da sala:\n");
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                sb.append(assentos[i][j].isReservado() ? "X " : "O ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}