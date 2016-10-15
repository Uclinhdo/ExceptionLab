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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       DataStorage ds = new InMemoryDatabase();
       ReceiptOutputStrategy output = new ReceiptConsoleOutput();
      
       
        Register reg = new Register();
       
        reg.startNewSale("DUTL",ds,output);
        reg.addProduct("A123",2);
        reg.addProduct("B345",7);
        reg.addProduct("D456", 1);
        reg.endSale();
        
        reg.startNewSale("MTRA",ds,output);
        reg.addProduct("C157",4);
        reg.addProduct("A123",1);
        reg.addProduct("E789", 1);
        reg.endSale();
        
    }
    
}
