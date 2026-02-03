class Product{
    private int price;
    private int stock;
    public int getprice(){
    return price;
    }
    public int getstock(){
    return stock;
    }
    public void setprice(int price){
    this.price=price;
    }
    public void setstock(int stock){
    this.stock=stock;
    }
    void pricing(int price){
        if(this.price<=price){
            System.out.println("price of the product is "+price);
        }else{
            System.out.println("price should be positive");
        }
    }
    void stocking(int stock){
        if (this.stock<=stock) {
            System.out.println("number of stocks   "+stock);
            
        }else{
            System.out.println("stock cannot be negetive");
        }
    }
}


public class Code7 {
    public static void main(String[] args) {
        Product pt = new Product();
        pt.setprice(0);
        pt.setstock(0);

        pt.pricing(-1);
        pt.stocking(-2);
    }

}
