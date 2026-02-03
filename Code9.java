class Temperature{
    private double celsius;
    public double getcelsius(){
        return celsius;
    }
    public void setcelsius(double celsius){
        this.celsius=celsius;
        
    }
    void Safety(){
        if(celsius >= -273.15){
            System.out.println("temperature is okay");
        }else{
            System.out.println("temperature is below the absolute zero");
        }
    }


}

public class Code9 {
    public static void main(String[] args) {
        Temperature tp =new Temperature();
        tp.setcelsius(12);
        tp.Safety();
    }
    
}
