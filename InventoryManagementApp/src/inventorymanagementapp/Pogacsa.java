/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementapp;



/**
 *
 * @author joci
 */
public class Pogacsa extends Product implements ShelfLife{

    protected int pizzaskrem;
    
        
        
        
        

    public Pogacsa(int pizzaskrem, String name, int dbTojas, int lTej, int dbCSoki) {
        super(name, dbTojas, lTej, dbCSoki);
        this.pizzaskrem = pizzaskrem;
    }

    public Pogacsa(String name, int dbTojas, int lTej, int sajt) {
        super(name, dbTojas, lTej, sajt);
    }

    public int getPizzaskrem() {
        return pizzaskrem;
    }

    public void setPizzaskrem(int pizzaskrem) {
        this.pizzaskrem = pizzaskrem;
    }

    @Override
    public void selfLife() {
        System.out.println(" 5 napos szavatossagi ido ");
    }

}
