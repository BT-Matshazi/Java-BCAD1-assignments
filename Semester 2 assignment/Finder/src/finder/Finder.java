
package finder;

import java.util.*;


public class Finder 
{
    static ArrayList<String> ProductCode = new ArrayList<String>();
    static ArrayList<Integer> ProductPrice = new ArrayList<Integer>();

    public static void DisplayMenu()
    {
        String[][] array = {{"hp", "4gb", "15,6 inches", "250gb SSD", "Intel i7", "2.0ghz"},
                            {"hp", "8gb", "14 inches", "250gb HHD", "Intel i5", "2.4ghz"},
                            {"hp", "2gb", "15,6 inches", "100gb HHD", "Intel cerelon", "1.2ghz"}};

        for(int i=0; i < array.length; i++)
        {
            int count = 0;
            int rows = array[0].length;
            if(array[0][i].contains("100"))
            {
                while (count < rows)
                {
                System.out.println(array[0][count]);
                count++;
                }
            }
            else
            {
                System.out.println("no item found");
            }
        }
    }


}
