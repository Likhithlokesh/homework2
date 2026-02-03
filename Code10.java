class Voter{
    private int age;

    public int getage(){
    return age;
    }
    public void  setage(int age){
        this.age=age;
    }
    void eligible(){
        if(age>=18){
            System.out.println("eligible to vote");
        }else{
            if(age<0){
            System.out.println("not eligible to vote and not a valid age");
            }else{
             System.out.println("not eligible to vote ");   
            }
    }
}
}



public class Code10 {
    public static void main(String[] args) {
        Voter vt = new Voter();
        vt.setage(18);
        vt.eligible();
    }
    
}