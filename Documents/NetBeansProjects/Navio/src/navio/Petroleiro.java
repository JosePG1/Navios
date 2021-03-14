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
    
     private Float capacidadeCarga;

    public Petroleiro(String nome, String matriculaNavio) {
        super(nome, matriculaNavio);
    }

    public Float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(Float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    
}
