/**
 * Outputs the sum of all the integers between 10 and 20, inclusive.
 * 
 * @author Tyler Benjamin
 * @version 11/1/17
 */
public class SumOutput
{
    static int count = 0;
    
    static int sum = 10;
    
    public static void main(String[] args)
    {
      do
       { 
           sum = sum + 1;
           count++;
        }
       while (count < 11);
    }
}