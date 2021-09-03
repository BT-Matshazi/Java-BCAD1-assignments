package bright_future_technologies;

import java.util.*;

class Product 
{
    // static ArrayList<ArrayList<String>> ProductTable = new ArrayList();

    static ArrayList<String> ProductCode = new ArrayList<String>();
    static ArrayList<String> ProductName = new ArrayList<String>();
    static ArrayList<String> ProductSupplier = new ArrayList<String>();
    
    static ArrayList<String> ProductCategory = new ArrayList<String>();
    static ArrayList<String> ProductWarranty = new ArrayList<String>();
    static ArrayList<Integer> ProductPrice = new ArrayList<Integer>();
    static ArrayList<Integer> ProductStockLevel = new ArrayList<Integer>();
  
    
    public static void intro()
    {
        //opening to the application
        System.out.println(" "); 
        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");
        System.out.println("**************************************");
    }

    public static int DisplayMenu()
    {   
        String a; 
        int b;

        //scanner declaration
        Scanner Input_1 = new Scanner(System.in);
        
        //application prompt 
        System.out.println("Please select one of the following menu items: ");
        System.out.println("(1) Capture a new product.");
        System.out.println("(2) Search for a product.");
        System.out.println("(3) Update a product.");
        System.out.println("(4) Delete a product.");
        System.out.println("(5) Print report.");
        System.out.println("(6) Exit Application.");
        System.out.println(" ");

        //getting users input 
        a = Input_1.nextLine(); 

        if(!(a.equals("1") || a.equals("2") ||  a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6")))
        {
            while(!(a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6")))
            {
                System.out.println(" ");
                System.out.println("Please enter a valid option ");
                System.out.println(" ");
                
                //application prompt 
                System.out.println("Please select one of the following menu items: ");
                System.out.println("(1) Capture a new product.");
                System.out.println("(2) Search for a product.");
                System.out.println("(3) Update a product.");
                System.out.println("(4) Delete a product.");
                System.out.println("(5) Print report.");
                System.out.println("(6) Exit Application.");
                System.out.println(" ");

                //getting users input 
                a = Input_1.nextLine();
            }
        }

        b = Integer.parseInt(a);

        //returning of the user's input 
        return b;
    }

    public static int Prompt()
    {
        String a;
        int b;

        //scanner declaration
        Scanner Input_1 = new Scanner(System.in);

        //application prompt 
        System.out.println("");
        System.out.print("Enter (1) to launch menu or any other key to exit: ");
        a = Input_1.nextLine(); 

        if(!(a.equals("1")))
        {
            ExitApplication();
        }
        b = Integer.parseInt(a);
        System.out.println("");

        //returning of the user's input 
        return b;
    }


    public static void CaptureProduct()
    {
        
        Scanner Input = new Scanner(System.in);
        System.out.println(" ");

        System.out.println("CAPTURE A NEW PRODUCT");
        System.out.println("**********************");

        System.out.print("Enter the product code: ");
        ProductCode.add(Input.nextLine());

        System.out.print("Enter the product name: ");
        String product_name = Input.nextLine();
        ProductName.add(product_name);

        System.out.print("Enter the supplier for " + product_name + " >> ");
        ProductSupplier.add(Input.nextLine());

        System.out.println("Select the product categoty: ");
        System.out.println("Desktop Computer - 1");
        System.out.println("Laptop - 2");
        System.out.println("Tablet - 3");
        System.out.println("Printer - 4");
        System.out.println("Gameing Console - 5");
        System.out.println(" ");

    
        System.out.print("Product Category >> ");
        int key = Integer.parseInt(Input.nextLine());

        if (key > 5 || key < 1)
        {
            while(key > 5 || key < 1)
            {
                System.out.println(" ");
                System.out.println("invalid options, please try again");
                System.out.println(" ");
                System.out.println("Select the product categoty: ");
                System.out.println("Desktop Computer - 1");
                System.out.println("Laptop - 2");
                System.out.println("Tablet - 3");
                System.out.println("Printer - 4");
                System.out.println("Gameing Console - 5");
                System.out.println(" ");
        
            
                System.out.print("Product Category >> ");
                key = Integer.parseInt(Input.nextLine());
            }
        }

        if(key == 1)
        {
            ProductCategory.add("Desktop Computer");
        }
        if(key == 2)
        {
            ProductCategory.add("Laptop");
        }
        if(key == 3)
        {
            ProductCategory.add("Tablet");
        }
        if(key == 4)
        {
            ProductCategory.add("Printer");
        }
        if(key == 5)
        {
            ProductCategory.add("Gameing Console");
        }

        System.out.println("");
        System.out.print("Indicate the product warrenty. Enter (1) for 6 months or any other key for 2 years. ");
        String key1 = (Input.nextLine());

        if(key1.equals("1"))
        {
            ProductWarranty.add("6 months");
        }
        if(!(key1.equals("1")))
        {
            ProductWarranty.add("2 years");
        }

        System.out.print("Enter the price for " + product_name + " >> ");
        ProductPrice.add(Input.nextInt());

        System.out.print("Enter the stock level for " + product_name + " >> ");
        ProductStockLevel.add(Input.nextInt());
       
    }

    public static void SearchProduct()
    {
        int position = 0;
        Scanner Input = new Scanner(System.in);

        System.out.println("");
        System.out.print("Please enter the product code: ");
        String index = Input.nextLine(); 
        position = ProductCode.indexOf(index);

        if(position == -1)
        {
            System.out.println("");
            System.out.println("Item could not be found");
        }
        else
        {
            System.out.println("");
            System.out.println("*************************************************************");
            System.out.println("PRODUCT SEARCH RESULTS");
            System.out.println("*************************************************************");
            System.out.println("PRODUCT CODE:              " + ProductCode.get(position));
            System.out.println("PRODUCT NAME:              " + ProductName.get(position));
            System.out.println("PRODUCT WARRANTY:          " + ProductWarranty.get(position));
            System.out.println("PRODUCT CATEGORY:          " + ProductCategory.get(position));
            System.out.println("PRODUCT PRICE:             R" + ProductPrice.get(position));
            System.out.println("PRODUCT STOCK LELVELS:     " + ProductStockLevel.get(position));
            System.out.println("PRODUCT SUPPLIER:          " + ProductSupplier.get(position));
            System.out.println("*************************************************************");
            System.out.println("");
        }
    }

    public static void UpdateProduct()
    {
        int position1 = 0;
        Scanner a = new Scanner(System.in);

        System.out.println("");
        System.out.print("Please enter the product code to update: ");
        String index = a.nextLine(); 
        position1 = ProductCode.indexOf(index);

        if(position1 == -1)
        {
            while(position1 == -1)
            {
                System.out.println("");
                System.out.println("Item could not be found");
                System.out.println(""); 
                System.out.print("Please enter the product code: ");
                index = a.nextLine(); 
                position1 = ProductCode.indexOf(index); 
            } 
        }

        if(position1  == 0)
        {
            System.out.print("Update the warranty? (y) YES, (n) NO: ");
            String input = a.nextLine();

            if(input.equals("y") || input.equals("yes"))
            {
                System.out.print("Indicate the product's new warrenty " + ProductName.get(position1) + " . Enter (1) for 6 months or any other key for 2 years. ");
                ProductWarranty.set(position1, (a.nextLine()));
            }

            System.out.print("Update the product price? (y) Yes, (n) No: ");
            input = a.nextLine();
            
            if(input.equals("y") || input.equals("yes"))
            {
                System.out.print("Enter the new price for " + ProductName.get(position1));
                ProductPrice.set(position1, (a.nextInt()));
            }

            System.out.print("Update the product stock level? (y) Yes, (n) No: ");
            input = a.nextLine();
            
            if(input.equals("y") || input.equals("yes"))
            {
                System.out.print("Enter the new stock level for " + ProductName.get(position1));
                ProductStockLevel.set(position1, (a.nextInt()));
            }

            System.out.print("Product has been updated succesfully!!!");
        }

     
    }

    public static void DeleteProduct()
    {
        int position = 0;
        Scanner a = new Scanner(System.in);

        System.out.println("");
        System.out.print("Please enter the product code to delete: ");
        String index = a.nextLine(); 
        position = ProductCode.indexOf(index);

        if(position == -1)
        {
            while(position == -1)
            {
                System.out.println("");
                System.out.println("Item could not be found");
                System.out.println(""); 
                System.out.print("Please enter the product code: ");
                index = a.nextLine(); 
                position = ProductCode.indexOf(index); 
            }  
        }

        if(position  == 0)
        {
            System.out.print("Are you sure you want to delete this product? (y) Yes, (n) No : ");
            String input = a.nextLine();

            if(input.equals("y") || input.equals("yes"))
            {
                ProductCode.remove(position);
                ProductName.remove(position);
                ProductCategory.remove(position);
                ProductWarranty.remove(position);
                ProductPrice.remove(position);
                ProductStockLevel.remove(position);
                ProductSupplier.remove(position);

                System.out.println("Successfully deleted");
            } 
        }

    }

    
    public static void ExitApplication()
    {
        System.out.println(" ");
        System.out.println("THANK YOU FOR USING OUR APPLICATION");
        System.out.println("**************************************");
    }

}
