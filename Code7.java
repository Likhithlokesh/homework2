class Electronic{
String brand = "Dell";
  void poweron(){
    System.out.println("brand name :"+brand);

  }
}
class Laptop extends Electronic{ 
    int ram=32;
    void child(){
        super.poweron();
        System.out.println("ram size:"+ram);

    }

}

public class Code7 {
    public static void main(String[] args) {
       Laptop lp = new Laptop();
       lp.child();


    }
    
}
