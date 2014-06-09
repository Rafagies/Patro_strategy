/*
 * Exercici de Javadoc
 */
package patro_strategy_equip;

/**
 * @author Joan Gilabert
 * @version 19  
 * 
 * Crea una branca del projecte amb el teu nom i el tornes a pujar al respositori amb el nom de la teua branca
 *
 */
public class Item {
    private String upcCode;
    private int price;
    
             
   /**
    * 
    * @param upc String
    * @param cost Enter
    */
    public Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }
 
    /**
     * 
     * @return geter de UpcCode
     */
    public String getUpcCode() {
        return upcCode;
    }
 
    /**
     * 
     * @return geter de Preu
     */
    public int getPrice() {
        return price;
    }
}
