class Account{
int accnumber= 12345678;
void acc(){
    System.out.println("account number:"+accnumber);
}
}
class Loanaccount extends Account{
    double loan = 200000;
    void EMI(int month){
        super.acc();
        System.out.println("loan taken:"+loan);
        if(month==12){
        double emi = loan/12;
        System.out.println("emi should be payed for month:"+emi);
        }else if(month == 6){
            double emi = loan/6;
            System.out.println("emi should be payed for month:"+emi);
        }else{
            System.out.println("emi is rejected");
        }
    }

}

public class Code9 {
    public static void main(String[] args) {
        Loanaccount la = new Loanaccount();
        la.EMI(12);

    }
    
}
