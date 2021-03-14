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
public class Main {
    
    
    
    
    
    public static void main(String[] args) {
        
        PortaContentores PortaCOntetos;
        
        PortaCOntetos =  new PortaContentores("Zé é ganda Nabo" , "navioDoZé" , 150);
        
        System.out.println("antes "+PortaCOntetos.getNumbMaxContentores());
        
       
        PortaCOntetos.setNumbMaxContentores(200);
        
        
        System.out.println("depois "+PortaCOntetos.getNumbMaxContentores());
        
    }
}
