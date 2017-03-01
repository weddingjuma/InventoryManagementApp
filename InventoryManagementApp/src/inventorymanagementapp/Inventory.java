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
public  class Inventory {

    public static int liszt = 10000;
    public static int lekvar = 25000;
    public static int tej = 5000;
    public static int tojas = 1500;
    public static int vaj = 7000;
    public static int csoki = 255000;
    
    
    
    
    
    public void kiad(Product product){
        
        csoki -= product.dbCSoki;
        tej-=product.lTej;
        tojas -= product.dbTojas;
        
        
    }

    @Override
    public String toString() {
        return "Inventory{ status: List : " +liszt + ""
                + " Levar "+ lekvar +
                " tej : " + tej+
                " tojas : " + tojas +
                " vaj : " + vaj +
                " csoki :" + csoki ;
    }
  
    
    
    
    
    
    

}
