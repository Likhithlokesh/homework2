class Rectangle{
double a;
double b;
Rectangle(double a,double b){
    this.a=a;
    this.b=b;
}
void area(){
  System.out.println(a*b);
}
void perimeter(){
System.out.println(2*a+2*b);
}


}

public class Code2 {
    public static void main(String[] args) {
        Rectangle rt =  new Rectangle(2,2);
        rt.perimeter();
        rt.area();


    }
    
}