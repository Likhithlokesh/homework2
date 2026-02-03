class Book{
   String title;
   String author;
   double price;
   Book(String title,String author,double price){;
    this.title=title;
    this.author=author;
    this.price=price;
   }
   void novel(){
    System.out.println("title is  " +title);
    System.out.println("author is  " +author);
    System.out.println("price is  "+price);
   }
}



public class Code7 {
    public static void main(String[] args) {
        Book bk = new Book("time","harsha",100);
        bk.novel();

    }
    
}