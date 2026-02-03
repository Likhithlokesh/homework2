class Mobile{
    private int batteryLevel;
    public int getbatteryLevel(){
        return batteryLevel;
    }
    public void setbatteryLevel(int batteryLevel){
        this.batteryLevel=batteryLevel;
    }
    void battery(int batteryLevel){
        if(this.batteryLevel>=batteryLevel){
            System.out.println("battery is getting charged");
        }else{
            System.out.println("battery is full");
        }
    }

}


public class Code6 {
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.setbatteryLevel(100);
        mb.battery(99);
    }
    
}