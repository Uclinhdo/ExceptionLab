/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author linhdo
 */
public class Receipt {
    private Customer customer;
    private DataStorage ds;
    private LineItem [] listOfitem;
    private ReceiptOutputStrategy output;
    private final Date currentDate =new Date();
    private final SimpleDateFormat date = new SimpleDateFormat("EEE, MMM d, yyyy hh:mm aaa");
    private static int receiptNo;
    private final String DASHED = "--------------------------------------------------------------------------------------------";
    private final String datetime;
    private double totalSubtotal;
    private double totalDiscount; 
    private final DecimalFormat formatter = new DecimalFormat("####.00");
    
    public Receipt(String customerId,DataStorage ds,ReceiptOutputStrategy output)throws DataSystemException {
        this.ds = ds;
        this.customer = ds.findValidCustomer(customerId);
        this.output = output;
        this.listOfitem = new LineItem[0];
        
        this.datetime = date.format(currentDate);
    }
    //everytime start new sale we need to increase recepit No, so we
    //have to create a method to increaseReceipt No and 
    //call it in the startnewsale method.
    public void incrementReceiptNo() {
        ++Receipt.receiptNo;
    }

    
    public final void addItemtoArray(LineItem[] arrayItem ,LineItem item)
    {
        LineItem [] temp = new LineItem[arrayItem.length + 1];
        System.arraycopy(arrayItem, 0, temp, 0, arrayItem.length);
        
        temp[temp.length - 1] = item;
        arrayItem = temp;
        listOfitem = arrayItem;
        //temp = null;
        totalSubtotal += item.getSubTotal();
        totalDiscount +=item.getDiscount();
        
    }
//    
    public final void addItemToReceipt(String productId, int qty)throws DataSystemException
    {
       LineItem item = null;
       try{
             item = new LineItem(productId,qty,ds);
       }catch(DataSystemException de){
           JOptionPane.showMessageDialog(null, de.getCause().getMessage());
       }
       addItemtoArray(listOfitem,item);
        
    }

  
    
    
    public final ReceiptOutputStrategy getOutput() {
        return output;
    }

    public final void setOutput(ReceiptOutputStrategy output) {
        this.output = output;
    }
    
 
    
    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final DataStorage getDs() {
        return ds;
    }
    
    public final void setDs(DataStorage ds) {
        this.ds = ds;
    }

    public final LineItem[] getListOfitem() {
        return listOfitem;
    }

    public final void setListOfitem(LineItem[] listOfitem) {
        this.listOfitem = listOfitem;
    }
    
   public final void outputReceipt() 
   {
       StringBuilder data = new StringBuilder("Welcome to Kohls Department Store \n");
       data.append("Customer Name: ").append(customer.getFullname()).append("\n");
       data.append("Date of Sales : ").append(datetime).append("\n");
       data.append("Receipt No: ").append(Receipt.receiptNo).append("\n");
       data.append("Product ID\tProduct Name\t\tPrice\tQty\tSubtotal\tDiscount").append("\n\n");
       data.append(DASHED).append("\n\n");

        for(LineItem item : listOfitem)
        {
            data.append(item.getProduct().getProductId()).append("\t\t");
            data.append(item.getProduct().getDescription()).append("\t");
            data.append(item.getProduct().getUnitPrice()).append("\t");
            data.append(item.getQty()).append("\t");
            data.append(formatter.format(item.getSubTotal())).append("\t\t");
            data.append(formatter.format(item.getDiscount())).append("\t").append("\n\n");
        }
        data.append("\t\t\t\t\t\t\t");
        data.append("Total: ").append(formatter.format(totalSubtotal)).append("\t");
        data.append("Total Saved: ").append(formatter.format(totalDiscount)).append("\n\n");
        data.append(DASHED).append("\n");
        data.append("\t\t\t\t\t\t\t\t");
        data.append("Grand Total: ").append(String.format("%.2f",(totalSubtotal - totalDiscount))).append("\n\n");
        data.append("Thank you for shopping at KOHLS!\n");
        data.append(DASHED).append("\n");
        data.append(DASHED);
        

   }
    
}
