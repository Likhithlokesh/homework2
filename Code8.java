class ATM{
    double a;
    double b;
    ATM(double a,double b){
        this.a=a;
        this.b=b;
        
    }
    void deposit(){
    System.out.println("deposited : " +a);
    }
    void withdraw() {
        System.out.println("withdraw : "+b);

    }
    void balance(){
        double c = a - b;
        System.out.println("balance is : "+c);

    }
}


public class Code8 {
    public static void main(String[] args) {
        ATM am = new ATM(1000,900);
        am.deposit();
        am.withdraw();
        am.balance();
    }
    
}
