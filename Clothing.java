import java.util.*;
/**
 * The Clothing class is an abstract subclass of Product.
 * 
 *  Has an additional attribute that stores the size of the item. The size is a value greater than zero.
 *  This must be set on construction and an invalid value must cause an unchecked exception to be thrown.
 * 
 * The class must 
 * 
 * NEEDS SIZE AND SUPERFIELDS
 * 
 * @author (kcr7) 
 * @version (1.0)
 */
public abstract class Clothing extends Product
{
    private int Size;
    //clothing size
    private String Description;
    //product decription
    private int Price;
    //product price
    private int Points;
    //reward points
     /**
     * Constructor for objects of class Product
     */
    public Clothing (String description, int price, int points, int size)
    {
     super(description, price, points);
      try{
          if (size >= 0){
           this.Size = size;
        }
       } catch (Exception e){
           System.out.println("Sorry, we have no items of this description.");
     }
    }

    
    public String getSize() 
    {
       return String.valueOf(this.Size);
     }
    
      /**
       * Returns details of all attributes of Clothing.
       */
      @Override
    public String toString()
    {
       return super.toString()  + this.Description;
    }

}