class Car{
    private int speed;;
    public int getspeed(){
        return speed;
    }
    public void setspeed(int speed){
        this.speed=speed;
    }
    void speeding(int speed){
        if(this.speed>=speed){
            System.out.println("maintain this speed");
        }else{
            System.out.println("you are exceeding speed");
        }
    }

}


public class Code5 {
    public static void main(String[] args) {
        Car cr = new Car();
        cr.setspeed(200);

        cr.speeding(210);
    }
    
}
