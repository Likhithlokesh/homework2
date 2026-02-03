class Library{
    private String title;
    private boolean isAvailable;
    
    public String gettitle(){
        return title;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void settitle(String title){
         this.title=title;
         
    }
    public void setisAvailbale(boolean isAvailbale){
        this.isAvailable=true;
    }
    void borrowBook(String title) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You borrowed the book: " + title);
        } else {
            System.out.println("Sorry! The book is already borrowed.");
        }
    }

    void returnBook(String title) {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You returned the book: " + title);
        } else {
            System.out.println("This book was not borrowed.");
        }
    }
}
public class Code8{
    public static void main(String[] args) {
        Library b1 = new Library();
        b1.settitle("java");
        
        b1.borrowBook("java"); 
        b1.returnBook("java");
        b1.borrowBook("java"); 
    }
}
