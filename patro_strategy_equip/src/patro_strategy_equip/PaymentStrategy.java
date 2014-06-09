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
public interface PaymentStrategy {
             
   /**
    * per a cada métode descriu els paràmetres per a generar el javadoc
    */ 
    
    /**
     * 
     * @param amount és un integer
     */
      public void pay(int amount);
}
