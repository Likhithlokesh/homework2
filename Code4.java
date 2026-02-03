class Bank{
    int a;
    int b;
    String name;
    double balance;
    Bank(int a,int b,String name,double balance){
        this.a=a;
        this.name=name;
        this.balance=balance;
        this.b=b;


    }
   
    void deposit(){
       System.out.println("deposited is "+a);
    }
    void withdraw(){
        System.out.println("withdrawed is "+b);

    }
    void balance(){
        System.out.println("balance is "+(a-b));
    }
    }



public class Code4 {
    public static void main(String[] args) {
        Bank bn = new Bank(1000,900,"yashas",1000.00);
        bn.deposit();
        bn.withdraw();
        bn.balance();

    }
    
}