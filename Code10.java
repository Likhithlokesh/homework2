class Appliance {
    int powerRating;

    void turnOn() {
        System.out.println("Appliance is turned ON with powerRating:"+powerRating);
    }
}

class WashingMachine extends Appliance {

    void washClothes() {
        System.out.println("Washing clothes...");
    }
}

public class Code10 {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.powerRating = 1500;   
        wm.turnOn();             
        wm.washClothes();        
    }
}
