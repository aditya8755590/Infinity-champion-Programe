package HWI;
import java.util.ArrayList;

public class Product {
    int ProductId;
    String productName;
    double price;
    int quantity;
    public Product(int ProductId,String productName,double price,int quantity){
        this.ProductId=ProductId;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }
     @Override
     public String toString(){
         return "Product id is "+this.ProductId+" product name is "+this.productName+" price is "+this.price+" quantity is "+this.quantity;
     }
     public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<Product>(5);
        products.add(new Product(01,"laptop",50000,10));
        products.add(new Product(02,"mobile",20000,20));
        products.add(new Product(03,"tablet",30000,15));
        products.add(new Product(04,"monitor",10000,5));
        products.add(new Product(05,"keyboard",5000,25));

        for(Product p:products){
            System.out.println(p);
        }

    }

}
