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

    public static int liszt = 150;
    public static int lekvar = 200;
    public static int tej = 150;
    public static int tojas = 500;
    public static int vaj = 650;
    public static int csoki = 120;
    
    
    
    
    
      public void allProducedProductsData (Product [] products)  {
        
        for (int i = 0; i < products.length; i++) {
            System.out.println( products[i].name+ "\t");
        }
        
    }
    
    
    
    
    
    public void kiad(Product product){
        
        csoki -= product.dbCSoki;
        tej-=product.lTej;
        tojas -= product.dbTojas;    
    }
    
    
    
    public void ellenoriz (){
        
        
        
        if (tojas<500) {
            System.err.println("A tojasbol kevesebb van mit 500 db ");
        }
    }
    

    @Override
    public String toString() {
        return "Inventory{ status: List : " +liszt + ""
                + " Levar "+ lekvar +
                " tej : " + tej                     +
                " tojas : " + tojas +
                " vaj : " + vaj +
                " csoki :" + csoki ;
    }
  
    
    
    
    
    
    

}
