package bright_future_technologies;

public class Bright_Future_Technologies
{
    public static void main (String [] args)
    {

        int menu_option = 0; 
        int prompt = 0;

        Product.intro();
        
        menu_option = Product.DisplayMenu();
               

        while(!(menu_option > 6))
        { 

            if(menu_option == 1)
            {
                Product.CaptureProduct();
            }          
            if(menu_option == 2)
            {           
                Product.SearchProduct();
            }
            if(menu_option == 3)
            {
                Product.UpdateProduct();
            }
            if(menu_option == 4)
            {
                Product.DeleteProduct();
            }
            if(menu_option == 5)
            {
                ReportData.report();
            }

            if(menu_option == 6)
            {
                Product.ExitApplication();
                break;      
            }

            
            prompt = Product.Prompt();

            if(prompt == 1)
            {
               menu_option = Product.DisplayMenu(); 
            }
            else 
            {
                Product.ExitApplication();
                break;
            }  
             
        }

        while(menu_option > 6 || menu_option < 1 )
        {
            System.out.println(" ");
            System.out.println("Try again, enter a number in the options given:");
            System.out.println(" ");  
            menu_option = Product.DisplayMenu();       
        }
    }
}