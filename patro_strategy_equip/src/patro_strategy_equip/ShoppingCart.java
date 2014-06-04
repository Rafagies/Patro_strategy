/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patro_strategy_equip;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafagimenez
 */
public class ShoppingCart {
    //List of items
    List<Item> items;
     
    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }
     
    public void addItem(Item item){
        this.items.add(item);
    }
     
    public void removeItem(Item item){
        this.items.remove(item);
    }
     
    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }
     
    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
