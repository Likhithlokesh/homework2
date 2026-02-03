class Circle{
    double r;
    Circle(double r){
        this.r=r;
    }
    void radius(){
       double area = 3.14*r*r;
       System.out.println("area is "+area);
    }
}



public class Code6 {
    public static void main(String[] args) {
        Circle cr = new Circle(8);
        cr.radius();
    }
}
