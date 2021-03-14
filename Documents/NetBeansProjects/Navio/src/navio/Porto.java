/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navio;

import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class Porto {
    
    private int ct;
    private int numbMaxNavios;
    
    private ArrayList<Navio> navio;
    
    /**
     *Construtor que recebe um unico parametro
     * @param numbMaxNavios
     */
    public Porto(int numbMaxNavios) {
        ct = 0;
        this.numbMaxNavios = numbMaxNavios;

        navio = new ArrayList<Navio>(numbMaxNavios);
    }

    /**
     *
     * @return
     */
    public int getNoMaxNavios() {
        return numbMaxNavios;
    }

    /**
     *Metodo para adicionar navios
     * @param n
     */
    public void addNavio(Navio n) {

        if (ct == numbMaxNavios) {
            System.out.println("Número máximo de navios (" + numbMaxNavios + ") Atingido!!");
        }
        boolean confirma = false;
        for (Navio nave : navio) {
            if (n.equals(nave.getMatriculaNavio())) {
                System.out.println("Navio já existe!!");
                confirma = true;
            }

            if (!confirma) {
                navio.add(nave);
                ct++;
            }

        }

    }

    /**
     *
     * @return
     */
    public int getCapacidadeTotal() {

        int total = 0;
        for (Navio p : navio) {
            if (p instanceof PortaContentores) {
                total += ((PortaContentores) p).getNumbMaxContentores();

            }
        }

        return total;
    }

    /**
     *
     * @return
     */
    public int getCargaTotal() {
        int total = 0;
        for (Navio p : navio) {
            if (p instanceof PortaContentores) {
                total += ((PortaContentores) p).getNumbMaxContentores() * 10;
            }
            if (p instanceof Petroleiro) {
                total += ((Petroleiro) p).getCapacidadeCarga() * 10;
            }
        }
        return total;
    }




//main

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Porto porto = new Porto(3);

        Petroleiro petro1 = new Petroleiro("Petras","P1"); petro1.setCapacidadeCarga(200);

        PortaContentores pConta1 = new PortaContentores("Petros","PC01",20); pConta1.setNumbMaxContentores(50);

        PortaContentores pConta2 = new PortaContentores("Petronas","PC02",11); pConta2.setNumbMaxContentores(20);

        Navio n = new Navio("Navigotas","N01");

        Petroleiro petro2 = new Petroleiro("Petroleiro1","P2"); petro2.setCapacidadeCarga(250);

        porto.addNavio(petro1);
        porto.addNavio(petro2);
        porto.addNavio(pConta1);
        porto.addNavio(pConta2);
        porto.addNavio(n);

        System.out.println("Capacidade total = " + porto.getCargaTotal() + " toneladas.");
        System.out.println("contentores total = " + porto.getCapacidadeTotal());
    }
}
