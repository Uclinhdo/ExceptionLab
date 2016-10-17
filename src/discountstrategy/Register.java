/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import javax.swing.JOptionPane;

/**
 *
 * @author ldo
 */
public class Register {
    
    private Receipt receipt;
    
    
    
 
    public final void endSale(){
        receipt.outputReceipt();
        
    }

    public final void startNewSale(String customerId, DataStorage ds,ReceiptOutputStrategy output) throws DataSystemException {
       try{
           receipt = new Receipt(customerId,ds,output);
       } catch(DataSystemException de){
           JOptionPane.showMessageDialog(null, de.getCause().getMessage());
       }
       
       receipt.incrementReceiptNo();
    }

   public final void addProduct(String productId, int qty)throws DataSystemException {
       try{
           receipt.addItemToReceipt(productId, qty);
       } catch(DataSystemException de){
           JOptionPane.showMessageDialog(null, de.getCause().getMessage());
       }
       
    }

   

 

   

   
    
}
