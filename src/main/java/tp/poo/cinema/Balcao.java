/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

  /*
 * Representa um balcão de vendas no cinema.
 */
public class Balcao {
    private boolean automatizado;
    private int id;
    private double rendimentoDiario;
    private double rendimentoMensal;
    private List<Venda> vendas; // Lista para armazenar as vendas

    /**
     * Construtor padrão.
     */
    public Balcao() {
    }

    /**
     * Construtor que inicializa o balcão com o ID e o status de automatização.
     *
     * @param id           o ID do balcão
     * @param automatizado se o balcão é automatizado
     */
    public Balcao(int id, boolean automatizado) {
        this.id = id;
        this.automatizado = automatizado;
        this.rendimentoDiario = 0;
        this.rendimentoMensal = 0;
    }

    /**
     * Obtém o ID do balcão.
     *
     * @return o ID do balcão
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do balcão.
     *
     * @param id o novo ID do balcão
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o rendimento diário do balcão.
     *
     * @return o rendimento diário
     */
    public double getRendimentoDiario() {
        return rendimentoDiario;
    }

    /**
     * Define o rendimento diário do balcão.
     *
     * @param rendimentoDiario o novo rendimento diário
     */
    public void setRendimentoDiario(double rendimentoDiario) {
        this.rendimentoDiario = rendimentoDiario;
    }

    /**
     * Obtém o rendimento mensal do balcão.
     *
     * @return o rendimento mensal
     */
    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    /**
     * Define o rendimento mensal do balcão.
     *
     * @param rendimentoMensal o novo rendimento mensal
     */
    public void setRendimentoMensal(double rendimentoMensal) {
        this.rendimentoMensal = rendimentoMensal;
    }

    /**
     * Verifica se o balcão é automatizado.
     *
     * @return true se o balcão for automatizado, false caso contrário
     */
    public boolean isAutomatizado() {
        return automatizado;
    }

    /**
     * Define o status de automatização do balcão.
     *
     * @param automatizado o novo status de automatização
     */
    public void setAutomatizado(boolean automatizado) {
        this.automatizado = automatizado;
    }

    /**
     * Adiciona uma venda ao rendimento diário e mensal.
     *
     * @param valorDaVenda o valor da venda
     */
    public void adicionarVenda(double valorDaVenda) {
        this.rendimentoDiario += valorDaVenda;
        this.rendimentoMensal += valorDaVenda;
    }

    /**
     * Calcula o rendimento mensal para um determinado mês e ano.
     *
     * @param mesAno o mês e ano para calcular o rendimento
     * @return o rendimento mensal
     */
    public double calcularRendimentoMensal(YearMonth mesAno) {
        double rendimento = 0;
        for (Venda venda : vendas) {
            if (YearMonth.from(venda.getData()).equals(mesAno)) {
                rendimento += calcularValorVenda(venda);
            }
        }
        return rendimento;
    }

    /**
     * Calcula o valor total de uma venda.
     *
     * @param venda a venda para calcular o valor
     * @return o valor total da venda
     */
    public double calcularValorVenda(Venda venda) {
        double total = 0;
        for (Produto produto : venda.getItensVendidos()) {
            total += produto.getPreco();
        }
        return total;
    }

    /**
     * Retorna uma representação em string do balcão.
     *
     * @return uma string representando o balcão
     */
    @Override
    public String toString() {
        return "Balcao{" +
                "automatizado=" + automatizado +
                ", id=" + id +
                ", rendimentoDiario=" + rendimentoDiario +
                ", rendimentoMensal=" + rendimentoMensal +
                '}';
    }
}