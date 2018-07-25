import java.util.ArrayList;
import java.util.*;
/**
 * 
 * Store details of all the different products that the company offers to customers. 
 * 
 * The Inventory class must not be aware of the different subtypes. 
 * Must only deal with products in terms of the Product type (i.e., it makes use of POLYMORPHISM).
 * 
 * The Inventory class is not concerned with how many of each type of product are stored in the warehouse.
 *  It is simply a record of every type of product that the company offers.
 *  
 * @author (kcr7) 
 * @version (1.0)
 */
public class Inventory implements Filter
{
    // An ArrayList to store the product
    public static ArrayList <Product> inventory;
    /**
     * Constructor for objects of class Inventory
     */
    public Inventory()
    {
         this.inventory = new ArrayList <Product> ();
    }

    /**
     * A method that allows any type of Product to be added
     */
    public void addProduct(Product productName)
    {
        this.inventory.add(productName);
     }
    
       /**
     * A method that returns a list of products based on specific selection criteria.
     * Iterates over collection of products, and passes each into Filter's method.
     */
    public boolean Accept(Object prod)
    {
        Object equalsprod;
        return true;
    }
     
    /**
     * A method that lists the full contents of Inventory
     */
    public void listProds()
    {
        if(this.inventory.isEmpty()) {
            System.out.println("No Products");
        }
        else {
            System.out.println(this.inventory);
      }

   }

}