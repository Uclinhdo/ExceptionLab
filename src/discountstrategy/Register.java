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
public class Register {
    
    private Receipt receipt;
    
    
    
 
    public final void endSale(){
        receipt.outputReceipt();
        
    }

    public final void startNewSale(String customerId, DataStorage ds,ReceiptOutputStrategy output) {
        
       receipt = new Receipt(customerId,ds,output);
       receipt.incrementReceiptNo();
    }

   public final void addProduct(String productId, int qty) {
        receipt.addItemToReceipt(productId, qty);
    }

   

 

   

   
    
}
