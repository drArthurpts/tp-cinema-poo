/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.poo.cinema;

/**
 * Representa um assento no cinema.
 */
public class Assento {
   private boolean reservado;

     /**
     * Construtor padrão que inicializa o assento como não reservado.
     */
    public Assento() {
        this.reservado = false;
    }
    
    
     /**
     * Verifica se o assento está reservado.
     *
     * @return true se o assento estiver reservado, false caso contrário.
     */
    public boolean isReservado() {
        return reservado;
    }

    
    
    /**
     * Reserva o assento.
     */
    public void reservar() {
        this.reservado = true;
    } 
    
    
    /**
     * Retorna uma representação em string do assento.
     *
     * @return uma string representando o assento.
     */
    @Override
    public String toString() {
        return "Assento{" +
                "reservado=" + reservado +
                '}';
    }
}
