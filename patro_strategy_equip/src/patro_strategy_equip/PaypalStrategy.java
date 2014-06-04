/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patro_strategy_equip;

/**
 *
 * @author Rafagimenez
 */
public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;
     
    public PaypalStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }
     
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
