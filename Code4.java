class Shape{
    void color(){
        System.out.println("color of the shape is red");
    }
 
}
class Rectangle extends Shape{
    int a=10;
    int b=20;
    void rArea(){
        System.out.println("area of the Rectangle"+a*b);
    }

}
class Circle extends Shape{
    int r= 3;
   double area= 3.14*r*r;
   void cArea(){
    System.out.println("circle area" +area);
   }

}




public class Code4 {
    public static void main(String[] args) {
       Circle cr = new Circle();
       Rectangle rt = new Rectangle();
       rt.color();
       rt.rArea();
       cr.cArea();
    }
    
}
