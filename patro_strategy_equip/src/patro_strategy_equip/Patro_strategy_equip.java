/*
 * Exercici de Javadoc
 */
package patro_strategy_equip;

/**
 * @author Vicent Biendicho
 * @version 23
 * Cal que fiques nom d'autor el teu, versio la teua edat, 
 *
 * Crea una branca del projecte amb el teu nom i el tornes a pujar al respositori amb el nom de la teua branca
 *
 */
public class Patro_strategy_equip {

           
   /**
    * per a cada métode descriu els paràmetres per a generar el javadoc
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
