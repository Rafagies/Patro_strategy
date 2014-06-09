/*
 * Exercici de Javadoc
 */
package patro_strategy_equip;

/**
 * @author Vicent Biendicho
 * @version 23
 * Cal que fiques nom d'autor el teu, versio la teua edat, 
 * Crea una branca del projecte amb el teu nom i el tornes a pujar al respositori amb el nom de la teua branca
 *
 */


  
public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;
     

    
    /**
     * 
     * @param nm es String
     * @param ccNum es String
     * @param cvv es String
     * @param expiryDate es String
     */
    
    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
   
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }
    
    /**
     * 
     * @param amount es Integer 
     */
    
    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");
    }
}
