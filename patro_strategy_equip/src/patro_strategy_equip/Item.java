/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patro_strategy_equip;

/**
 *
 * @author Rafagimenez
 */
public class Item {
    private String upcCode;
    private int price;
     
    public Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }
 
    public String getUpcCode() {
        return upcCode;
    }
 
    public int getPrice() {
        return price;
    }
}
