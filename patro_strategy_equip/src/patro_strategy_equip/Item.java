/*
 * Exercici de Javadoc
 */
package patro_strategy_equip;

/* 
 * Cal que fiques nom d'autor el teu, versio la teua edat, 
 * Crea una branca del projecte amb el teu nom i el tornes a pujar al respositori amb el nom de la teua branca
 *
 */
public class Item {
    private String upcCode;
    private int price;
    
             
   /**
    * per a cada métode descriu els paràmetres per a generar el javadoc
    */ 
    
    
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
