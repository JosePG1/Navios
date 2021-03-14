package navio;

/**
 *
 * @author Pedro
 */
 class PortaContentores extends Navio{
    
    private int numbMaxContentores;

    public PortaContentores(String nome, String matriculaNavio , int numbMaxContentores ) {
        super(nome, matriculaNavio); 
        
       this.numbMaxContentores = numbMaxContentores;
    }

    public int getNumbMaxContentores() {
        return numbMaxContentores;
    }

    public void setNumbMaxContentores(int numbMaxContentores) {
        this.numbMaxContentores = numbMaxContentores;
    }
    
    
    
    
    
    
}
