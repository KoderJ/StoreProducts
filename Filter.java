
/**
 * Filter interface has a single abstract method
 * Takes a Product as a parameter and returns a boolean result
 * @author (kcr7) 
 * @version (1.0)
*/
public interface Filter
{
    /**
     * Takes Product type as parameter
     * Returns a boolean result
     */
    public boolean Accept (Object prod);
    
}

