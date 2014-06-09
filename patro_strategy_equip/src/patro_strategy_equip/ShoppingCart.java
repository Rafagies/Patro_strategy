/*
 * Exercici de Javadoc
 */
package patro_strategy_equip;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joan Gilabert
 * @version 19   
 * 
 * Crea una branca del projecte amb el teu nom i el tornes a pujar al respositori amb el nom de la teua branca
 *
 */
public class ShoppingCart {
    
             
   
    //List of items
    List<Item> items;
    
    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }
     
    /**
     * 
     * @param item Item
     */
    public void addItem(Item item){
        this.items.add(item);
    }
    
    /**
     * 
     * @param item Item
     */
    public void removeItem(Item item){
        this.items.remove(item);
    }
    
    /**
     * 
     * @return Int
     */
    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }
    
    /**
     * 
     * @param paymentMethod Per a pagar
     */
    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
