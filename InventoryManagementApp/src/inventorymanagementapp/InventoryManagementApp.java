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
        
        
        System.out.println(inventory);
        
        inventory.kiad(pogi);
        
        
        System.out.println(inventory);
            
    }
    
}
