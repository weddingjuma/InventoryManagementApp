/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementapp;

import java.util.Scanner;

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

        Pogacsa pogi = new Pogacsa("Pogi", 100, 4, 10);

        Pogacsa pogi2 = new Pogacsa("Pogi", 70, 4, 10);

        Pogacsa pogi3 = new Pogacsa("Pogi", 12, 4, 10);

        Pogacsa pizzasPogi = new Pogacsa(15, " PizzasPogi", 15, 2, 21);
        
        
        Torta torta = new Torta(15, "Dobos Torta", 21, 5, 15);
        
        
  
        

          Product[] outProducts = new Product[2];
         outProducts[0] = pogi;
        outProducts[1] = pizzasPogi;
        
        
        
        System.out.println(inventory);
        inventory.kiad(pogi);
        System.out.println(inventory);
        inventory.kiad(pogi);
        System.out.println(inventory);

        inventory.ellenoriz();
        
        
    
         inventory.refillInventory();   
        
        
        
        
        
       // System.out.println(inventory.toString());
    }

}
