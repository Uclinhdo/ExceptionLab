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
public class Product {
    private String productId;
    private String description;
    private double unitPrice;
    private DiscountStrategy discountStrategy;

    public Product(String productId, String description, double unitPrice, DiscountStrategy discountStrategy) {
        this.productId = productId;
        this.description = description;
        this.unitPrice = unitPrice;
        this.discountStrategy = discountStrategy;
        
    }
    
   
    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        
        this.productId = productId;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        
        this.description = description;
    }


    public final double getUnitPrice() {
        return unitPrice;
    }
    
    public final void setUnitPrice(double unitPrice) {
       
        this.unitPrice = unitPrice;
    }

    public final DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public final void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    
   
    
    
    
}
