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
public class InventoryManagementApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Inventory inventory = new Inventory();
     
        
        
        Pogacsa pogi = new Pogacsa("Pogi",12 , 4, 20);
        Pogacsa pizzasPogi = new Pogacsa(15, " PizzasPogi", 15, 2, 21);
        
        
        Product [] outProducts = new Product[2];
        outProducts[0] = pogi;
        outProducts[1] = pizzasPogi;
        
        
        inventory.allProducedProductsData(outProducts);
        
        
//        System.out.println(inventory);
//        
//        inventory.kiad(pogi);
//        
//        
//        System.out.println(inventory);
//        
//        
//        inventory.ellenoriz();
            
    }
    
}
