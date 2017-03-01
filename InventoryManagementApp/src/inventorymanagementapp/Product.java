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
public abstract class Product extends Inventory {

    protected String name;
    protected int dbTojas;
    protected int lTej;
    protected int dbCSoki;
    protected int sajt;

    public Product(String name, int dbTojas, int lTej, int sajt) {
        this.name = name;
        this.dbTojas = dbTojas;
        this.lTej = lTej;
        this.sajt = sajt;
    }

    public Product(String name, int dbTojas, int lTej, int dbCSoki, int sajt) {
        this.name = name;
        this.dbTojas = dbTojas;
        this.lTej = lTej;
        this.dbCSoki = dbCSoki;
        this.sajt = sajt;
    }
    
    
    
    
    

  

   
    public Product() {
    }

}
