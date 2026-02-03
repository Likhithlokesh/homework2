class Vehicle{
    String brand = "toyota";
    int speed = 300;
    void parent(){
        System.out.println("brand:"+brand);
        System.out.println("speed:"+speed);
    }

}
class Car extends Vehicle{

    String fuelType = "diesel";
    void supra(){
        super.parent();
        System.out.println("FuelType:"+fuelType);
    }

}



public class Code2 {
    public static void main(String[] args) {
        Car cr = new Car();
        cr.supra();
    }
    
}