class Bank{
    int a =10000;
    void branch(){
        System.out.println("SBI bank of mysore");
    }

}
class Savingsaccount extends Bank{
    
    void addintrest(){
        double b = (a/150)*100;
        System.out.println("balance after intrest:"+b);

    }

}
class currenttaccount extends Bank{ 
    void deductcharges(){
        double d = (a/150)*100;
        System.out.println("balance after charges for maintainance:"+d);

    }


}


public class Code6 {
    public static void main(String[] args) {
        Savingsaccount sa  =  new Savingsaccount();
        currenttaccount ca = new currenttaccount();
        sa.branch();;
        sa.addintrest();
        ca.deductcharges();

    }
    
}
