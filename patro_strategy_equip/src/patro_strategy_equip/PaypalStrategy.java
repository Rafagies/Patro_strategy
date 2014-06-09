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
public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;
    
    /**
     * 
     * @param email String
     * @param pwd String
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
