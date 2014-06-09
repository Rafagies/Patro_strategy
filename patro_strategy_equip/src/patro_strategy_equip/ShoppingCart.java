/*
 * Exercici de Javadoc
 */
package patro_strategy_equip;

import java.util.ArrayList;
import java.util.List;

/* 
 * Cal que fiques nom d'autor el teu, versio la teua edat, 
 * 
 * Crea una branca del projecte amb el teu nom i el tornes a pujar al respositori amb el nom de la teua branca
 *
 */
public class ShoppingCart {
    
             
   /**
    * per a cada métode descriu els paràmetres per a generar el javadoc
    */ 
    
    //List of items
    List<Item> items;
     
    public ShoppingCart(){
        this.items=new ArrayList<>();
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
