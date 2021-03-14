/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navio;

/**
 *
 * @author Pedro
 */
public class Petroleiro extends Navio {
    
     private int capacidadeCarga;

    /**
     *Construtor Petroleiro que recebe os seguintes parametros
     * @param nome
     * @param matriculaNavio
     */
    public Petroleiro(String nome, String matriculaNavio) {
        super(nome, matriculaNavio);
    }

    /**
     *
     * @return
     */
    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    /**
     *
     * @param capacidadeCarga
     */
    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    
}
