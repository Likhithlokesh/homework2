class ATM{
    private double balance;
    private int pin;
    int withdraw;
    public double getbalance(){
        return balance;
    }
    
    public void setbalance(double balance){
        this.balance=balance;
        
    }
    public int getpin(){
        return pin;
    }
    public void setpin(int pin){
        this.pin=pin;
    }
    void enterpin(int pin) throws Exception{

        if(this.pin==pin){
            System.out.println("successfull");
            if(true){
                
            }
        }else{
            throw new Exception("Wrong PIN entered");
        }
    }
     void withdrawing(int withdraw){
            balance = balance-withdraw;
            System.out.println("withdrawing : "+withdraw);
            System.out.println("balance is "+balance);
        }
}



public class Code4 {
    public static void main(String[] args) {
        ATM am = new ATM();
        am.setpin(1234);
        am.setbalance(100000);
       try{
        am.enterpin(1235);
        am.withdrawing( 5000);
    }
    catch(Exception e){
        System.out.println("Exception: " + e.getMessage());
    }
}
}