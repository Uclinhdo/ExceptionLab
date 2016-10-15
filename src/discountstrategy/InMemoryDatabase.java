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
public class InMemoryDatabase implements DataStorage {
   private Customer [] customers= { new Customer ("DUTL","Linh","Do","888-888-8888"),
                                    new Customer ("MTRA","Matt","Ament","123-456-7890"),
                                    new Customer ("HEAE","Ares","Ament","999-999-9999")
                                  };
           
    private Product [] products = { new Product("A123","Brewers BLue Hat",29.90, new NoDiscount()),
                                    new Product("B345","Calvin Klein Blue Jeans",88.50,new PercentOffDiscount(0.10)),
                                    new Product("C157","Lamb Chop-Pet Toy",5.25,new QtyDiscount(.10,5)),
                                    new Product("D456","Black Plain Jacket",98.75,new NoDiscount()),
                                    new Product("E789","Sunglasses Polarized",121.00,new PercentOffDiscount(0.10)),
                                    new Product("F567","Converse Red Shoes",56.90,new QtyDiscount(.10,5))
                                  };
    
    
    @Override
    public final Customer findValidCustomer(String customerId)throws DataSystemException{
        if(customerId == null || customerId.isEmpty())
        {
            throw new DataSystemException();
        }
        Customer validcustomer = null;
        for(Customer customer : customers){
            if(customerId.equals(customer.getCustomerId())){
                validcustomer = customer;
            break;
            }
        }
        return validcustomer;
    }
    
    
    
    @Override
    public final Product findValidProduct(String productId) throws DataSystemException{
        if(productId == null || productId.isEmpty())
        {
            throw new DataSystemException();
        }
        
        Product validproduct = null;
        for (Product product : products){
            if(productId.equals(product.getProductId())){
                validproduct = product;
                break;
            }
           
        }
         return validproduct;
    }
    
}
