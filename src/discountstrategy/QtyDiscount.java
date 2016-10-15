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
public class QtyDiscount implements DiscountStrategy {
    private double discountRate = 0.10;
    private int qty;

    public QtyDiscount(double discountRate, int qty) {
        this.discountRate = discountRate;
        this.qty = qty;
    }
    
    
    @Override
    public final double getdiscountAmount(double unitPrice,int qty){
        if(qty == 5){
            return  unitPrice * qty * discountRate;
        }else{
            return 0;
        }
    }

   
    public final double getDiscountRate() {
        return discountRate;
    }

    
    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }    

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        this.qty = qty;
    }
    
    
    
    
}
