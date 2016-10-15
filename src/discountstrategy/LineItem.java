/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author ldo
 */
public class LineItem {
    private int qty;
    private Product product;
    
    public LineItem(String productId, int qty, DataStorage ds) {
        this.qty = qty;
        product = ds.findValidProduct(productId);
       
        
    }

    public final double getDiscount()
    {
        return product.getDiscountStrategy().getdiscountAmount(product.getUnitPrice(), qty);
    }
    
    
    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        this.qty = qty;
    }

    public final double getSubTotal() {
        return qty * product.getUnitPrice();
    }

    

    public final double getDiscountTotal() {
        return product.getDiscountStrategy().getdiscountAmount(product.getUnitPrice(), qty);
    }

   
    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }
    
    
   
    
    
    
    
}
