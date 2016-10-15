/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import javax.swing.JOptionPane;

/**
 *
 * @author linhdo
 */
public class ReceiptGuiOutput implements ReceiptOutputStrategy {
    
  @Override
  public final void printReceipt(String output){
      JOptionPane.showMessageDialog(null, output);
      
  }
    
}
