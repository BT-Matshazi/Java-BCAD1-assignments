package bright_future_technologies;

import javax.swing.JOptionPane;

class ReportData extends Product 
{
    String productCode;
    String productName;
    String productCategory;
    String productWarranty;
    int productPrice;
    int productStockLevel;
    String productSupplier;

    public String getProductCode() 
    {
        return productCode;
    }

    public void setProductCode(String productCode) 
    {
        this.productCode = productCode;
    }

    public String getProductName() 
    {
        return productName;
    }

    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductCategory() 
    {
        return productCategory;
    }

    public void setProductCategory(String productCategory) 
    {
        this.productCategory = productCategory;
    }

    public String getProductWarranty() 
    {
        return productWarranty;
    }

    public void setProductWarranty(String productWarranty) 
    {
        this.productWarranty = productWarranty;
    }

    public int getProductPrice() 
    {
        return productPrice;
    }

    public void setProductPrice(int productPrice) 
    {
        this.productPrice = productPrice;
    }

    public int getProductStockLevel() 
    {
        return productStockLevel;
    }

    public void setProductStockLevel(int productStockLevel) 
    {
        this.productStockLevel = productStockLevel;
    }

    public String getProductSupplier() 
    {
        return productSupplier;
    }

    public void setProductSupplier(String productSupplier) 
    {
        this.productSupplier = productSupplier;
    }



    public static void report()
    {
        int count = 0;
        int key = ProductCode.size();
        int sum = 0;
        int num;

        if(key == 0)
        {
            System.out.println(" ");
            JOptionPane.showMessageDialog(null, "No information found, please capture information first.",
            "ERROR!", JOptionPane.ERROR_MESSAGE);
            System.out.println(" ");
            CaptureProduct();
        }

    if(key > 0)
        {
        ReportData a = new ReportData();

        System.out.println(" "); 
        System.out.println("PRODUCT REPORT");
        System.out.println("======================================================================");

        while( count < key)
        {
            a.setProductCode(ProductCode.get(count));
            a.setProductName(ProductName.get(count));
            a.setProductWarranty(ProductWarranty.get(count));
            a.setProductCategory(ProductCategory.get(count));
            a.setProductPrice(ProductPrice.get(count));
            a.setProductStockLevel(ProductStockLevel.get(count));
            a.setProductSupplier(ProductSupplier.get(count));


            System.out.println("PRODUCT " + (count + 1)); 
            System.out.println("--------------------------------------------------------------------- "); 
            System.out.println("PRODUCT CODES >>      " + a.getProductCode()); 
            System.out.println("PRODUCT NAME >>       " + a.getProductName()); 
            System.out.println("PRODUCT CATEGORY >>   " + a.getProductCategory());
            System.out.println("PRODUCT WARRANTY >>   " + a.getProductWarranty()); 
            System.out.println("PRODUCT PRICE >>      R" + a.getProductPrice()); 
            System.out.println("PRODUCT LEVEL >>      " + a.getProductStockLevel()); 
            System.out.println("PRODUCT SUPPLIER >>   " + a.getProductSupplier()); 
            System.out.println("--------------------------------------------------------------------- "); 

            num = a.getProductPrice();
            sum = sum + num;
            count++;
        }

        System.out.println("======================================================================");
        System.out.println("TOTAL PRODUCT COUNT:   " + count); 
        System.out.println("TOTAL PRODUCT VALUE:   R" + sum);
        System.out.println("AVARAGE PRODUCT VALUE: R" + (sum/count)); 
        System.out.println("======================================================================");
    }  
    
    }
}