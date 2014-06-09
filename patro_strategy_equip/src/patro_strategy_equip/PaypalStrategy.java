/*
 * Exercici de Javadoc
 */
package patro_strategy_equip;

/*  @author Raul Mulet
 * @versio 34
 * Cal que fiques nom d'autor el teu, versio la teua edat, 
 * 
 * Crea una branca del projecte amb el teu nom i el tornes a pujar al respositori amb el nom de la teua branca
 *
 */
public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;
     
             
   /**
    * per a cada métode descriu els paràmetres per a generar el javadoc
    */ 
    
    /**
     * 
     * @param email és un String
     * @param pwd és un String
     */
    public PaypalStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }
     
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
