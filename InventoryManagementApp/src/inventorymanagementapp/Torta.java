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
public class Torta extends Product {
    
    protected int tejszinhab;

    public Torta(int tejszinhab, String name, int dbTojas, int lTej, int dbCSoki) {
        super(name, dbTojas, lTej, dbCSoki);
        this.tejszinhab = tejszinhab;
    }

    public int getTejszinhab() {
        return tejszinhab;
    }

    public void setTejszinhab(int tejszinhab) {
        this.tejszinhab = tejszinhab;
    }
    
    
    
    
    
    
}
