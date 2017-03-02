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
public class Inventory {

    public static int liszt = 150;
    public static int lekvar = 200;
    public static int tej = 150;
    public static int tojas = 500;
    public static int vaj = 650;
    public static int csoki = 120;
    protected int tejszinhabraktaron = 150;
    protected int pizzakremARaktarban = 70;

    public void allProducedProductsData(Product[] products) {

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].name + "\t" + products[i].kolbasz);
        }

    }

    public void refillInventory() {

        liszt = 150;
        lekvar = 200;
        tej = 150;
        tojas = 500;
        vaj = 650;
        csoki = 120;
        tejszinhabraktaron = 150;
        pizzakremARaktarban = 70;

    }

    public void kiad(Pogacsa product) {

        if (csoki > 50) {
            csoki -= product.dbCSoki;

        } else {
            System.err.println("nincs  tobb csoki ");
        }
        if (tej > 50) {
            tej -= product.lTej;
        } else {
            System.err.println("Nincs tobb tej ");
        }
        if (tojas > 50) {
            tojas -= product.dbTojas;
        }
        if (liszt > 60) {
            liszt -= product.lisztPorduct;
        } else {
            System.err.println("nincs tobb liszt ");
        }
        if (lekvar > 60) {
            lekvar -= product.lekvarpro;

        } else {
            System.err.println("nincs tobb lekvar");
        }
        if (pizzakremARaktarban > 15) {

            pizzakremARaktarban -= product.pizzaskrem;
        } else {
            System.err.println("nincs tobb pizzakrem ");
        }

    }

    public void kiad(Torta product) {

        if (csoki < 20) {
            System.out.println(" product can not take on the delivery list ");
        } else if (csoki > 20) {

            csoki -= product.dbCSoki;

        }

        tej -= product.lTej;
        tojas -= product.dbTojas;
        vaj -= product.vaj;
        liszt -= product.lisztPorduct;
        lekvar -= product.lekvarpro;
        tejszinhabraktaron -= product.tejszinhab;
    }

    public void ellenoriz() {
        if (tojas < 100) {
            System.err.println("A tojasbol kevesebb van mit 500 db ");
        }
    }

    @Override
    public String toString() {
        return "  In the inventory the amount of liszt is " + liszt + "  lekvar  :" + lekvar + "  tej  " + tej + " tojas  " + tojas + " vaj " + vaj + " ";
    }

}
