/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author linhdo
 */
public class NoDiscount implements DiscountStrategy{
    private double discountRate = 0;

    

    @Override
    public final double getdiscountAmount(double unitPrice, int qty){
        return 0;
    }
    
    
    
    public final double getDiscountRate() {
        return discountRate;
    }

    
    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
  
    
    
}
