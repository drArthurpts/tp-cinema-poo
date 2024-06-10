/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;




import java.time.LocalDate;

/**
 * Classe que representa alimentos, que são um tipo de produto.
 */
public class Alimentos extends Produto {
    
    
     /**
     * Construtor padrão da classe Alimentos.
     */
    public Alimentos() {
        
    }
    
     /**
     * Construtor da classe Alimentos.
     *
     * @param nome         o nome do alimento
     * @param DataValidade a data de validade do alimento
     * @param preco        o preço do alimento
     */
    public Alimentos(String nome, LocalDate DataValidade, Double preco){
        
        super(nome, DataValidade, preco);
        
    }
    
    
    /**
     * Retorna a representação em string do objeto Alimentos.
     *
     * @return a representação em string do objeto Alimentos
     */
    @Override
    public String toString() {
        return "Alimentos{" + super.toString() + "}";
    }
}
