/*
 * Exercici de Javadoc
 */
package patro_strategy_equip;

/**
 * @autor SalvaPuig
 * @version 27
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
    * per a cada métode descriu els paràmetres per a generar el javadoc
    * @param name de tipus cadena 
    * @param cardNumber de tipus cadena 
    * @param cvv de tipus cadena 
    * @param dateOfExpiry de tipus cadena 
    */ 
    
    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
   
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");
    }
}
