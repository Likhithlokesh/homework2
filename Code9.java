class Mobile{
String brand;
double batteryPercentage;

Mobile(String brand,double batteryPercentage){
    this.brand=brand;
    this.batteryPercentage=batteryPercentage;

}
void lenovo(){
    System.out.println("brand is  "+brand);
    if(batteryPercentage<=100){
        System.out.println("batterypercentage is  "+batteryPercentage);
    }else{
        System.out.println("type mistake");
    }
}
}

public class Code9 {
    public static void main(String[] args) {
        Mobile mb = new Mobile("lenovo",300);
        mb.lenovo();

    }
    
}
