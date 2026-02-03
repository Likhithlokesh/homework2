
class College{
    String collegename;
    String location;
    College(String collegename,String location){
        this.collegename=collegename;
        this.location=location;
    }
    void mitm(){
      System.out.println("college  "+collegename+" is in "+location);
    }
    void bmc(){
      System.out.println("college   "+collegename+" is in "+location);
    }
    void jce(){
      System.out.println("college   "+collegename+" is in "+location);
    }
}

public class Code10 {
    public static void main(String[] args) {
        College c1 = new College("mitm","mysore");
        College c2 = new College("bmc","banglore");
        College c3 = new College("jce","mysore");
        c1.mitm();
        c2.bmc();
        c3.jce();

    }
    
}
