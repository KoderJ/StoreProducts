import java.util.*;

/**
 * The Product class is an abstract class.
 * 
 * Stores details of shared attributes.
 * 
 * @author (kcr7) 
 * @version (1.0)
 */
    public abstract class Product
{
    private String Description;
    //product decription
    private int Price;
    //product price
    private int Points;
    //reward points
    private int Size;
    //size of clothing
    private int Energy;
    //energy rating
     /**
     * Constructor
     * Takes the initial values for all attributes. 
     * The integer values must be greater-than or equal to zero 
     * The description must be a non-null, non-empty string. 
     * If any of these requirements are not met, throw an unchecked exception.
     */
     public Product(String description, int price, int points) 
     {
        try {
         if (!description.equals(null) && price >= 0 && points >= 0) { 
             this.Description = description;
             this.Price = price;
             this.Points = points;
            }
        } catch(Exception e){
              System.out.println("Sorry we do not have anything of this request");    
      }
    }
               
    
    public String getDescription()
    {
       return this.Description;
     }
   
    public String getPrice()
    {
       return "" + this.Price;
    }
    
      public String getPoints()
    {
       return "" + this.Points;
    }
    
       public String getSize()
    {
       return  "" + this.Size;
    }

    
    /**
     * RETURNS DETAILS OF ALL ATTRIBUTES
     */
    @Override
    public String toString()
    {
        return "Description: " + this.getDescription() + 
        ", Price: " + this.Price + 
        ", Points: " + this.Points + 
        ", Size: " + getSize();
    }
    
}