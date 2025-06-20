class Product {
    int productId;
    String productName;
    String category;

    Product(int productId,String productName,String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }
    
     public int getProductId() {
        return productId;
    }
    public String getProductName() {
         return productName;
    }
    public String getCategory() {
        return category;
    }


    @Override
    public String toString(){
        return "Product [id= "+productId+" ,productName= "+productName+" ,category= "+category+"]";
    }
    
}
