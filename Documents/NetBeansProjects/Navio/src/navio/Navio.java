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
public class Navio {
    
   private String matriculaNavio;
   private String nome;
   private Float comprimento;
   
   
   
   /** Construtor Navio */
   public Navio(String nome,String matriculaNavio){
       this.nome = nome;
       this.matriculaNavio = matriculaNavio;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getComprimento() {
        return comprimento;
    }

    public void setComprimento(Float comprimento) {
        this.comprimento = comprimento;
    }

    public String getMatriculaNavio() {
        return matriculaNavio;
    }
    
   

    
    
}
