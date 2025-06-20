import java.util.*;

public class Main {


    public static Product LinearSearch(Product product[],String target){
        for(Product p:product){
            if(p.getProductName().equalsIgnoreCase(target)){
                return p;
            }
        }

       return null;
    }


    public static Product BinarySearch(Product product[],String target){
         Arrays.sort(product,Comparator.comparing(p->p.getProductName().toLowerCase()));
         int l=0,r=product.length-1;
         while(l<=r){
            int mid=l+(r-l)/2;
            int c=product[mid].getProductName().compareToIgnoreCase(target);
            if(c==0){
                return product[mid];
            }
           else if(c<0){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
            
            
         }

        return null;

    }
    public static  void main(String[] args){
        Product[] product={
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Book", "Stationery"),
            new Product(4, "Phone", "Electronics")

        };
       Product result1= LinearSearch(product, "Phone");
       Product result2= BinarySearch(product, "Book");
       System.out.println("Linear Search");
       System.out.println((result1!=null)?result1:"Not Found");
       System.out.println("Binary Search");
       System.out.println((result2!=null)?result2:"Not Found");


    
    }
}
