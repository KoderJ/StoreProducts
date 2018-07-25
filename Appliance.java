import java.util.*;
/**
 * The Appliance class is an abstract subclass of Product.
 * 
 * Has an additional attribute that stores the energy rating of an appliance. 
 * An energy rating is a value in the range 1-5. 
 * This must be set on construction and an invalid value must cause an unchecked exception to be thrown.
 * 
 * Defines a toString method that returns details of all of the attributes of an appliance 
 * 
 * @author (kcr7) 
 * @version (1.0)
 */
 public abstract class Appliance extends Product
{
    private int Energy;
   //appliance energy
    
     /**
     * Constructor for objects of class Appliance
     * Energy rating set between 1 and 5
     */
    public Appliance (String description, int price, int points, int energyRating)
      {
       super(description, price, points);    
     try{
       
       if (energyRating >= 1 && energyRating <= 5){
         this.Energy = energyRating;
        }
        
      }catch(Exception e)
      {
          System.out.println ("Energy rating must be between 1 and 5");
    }
   }
    
      
   /**
    * Returns energry rating of an Appliance
    */
   public String getEnergy()
   {
       return "" + this.Energy;
    }
    
   /**
    * Returns all attributes of Appliance
    */
   @Override
    public String toString()
    {
        return super.toString() + getEnergy();
    }

}
