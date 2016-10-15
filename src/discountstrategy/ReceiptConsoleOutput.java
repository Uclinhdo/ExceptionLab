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
public class ReceiptConsoleOutput implements ReceiptOutputStrategy {
    
    
    
    @Override
    public final void printReceipt(String output){
        System.out.println(output);
    }
    
}
