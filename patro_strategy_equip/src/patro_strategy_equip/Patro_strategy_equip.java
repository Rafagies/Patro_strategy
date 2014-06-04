/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patro_strategy_equip;

/**
 *
 * @author Rafagimenez
 */
public class Patro_strategy_equip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
         
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
         
        cart.addItem(item1);
        cart.addItem(item2);
         
        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
         
        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}
