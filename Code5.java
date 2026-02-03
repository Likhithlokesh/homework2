import javax.sql.rowset.spi.SyncResolver;

class Employee{
String name = "yashas";
double salary = 100000;
void grandparent(){
    System.out.println("name:"+name);
    System.out.println("salary:"+salary);
}
}
class Developer extends Employee {
    void code(){
        super.grandparent();
        System.out.println("i am the code developer");

    }

}
class Manager extends Developer{
    void manageteam(){
        super.code();
        System.out.println("i am the manager");

    }

}

public class Code5 {
    public static void main(String[] args) {
        Manager mg = new Manager();
        mg.manageteam();
    }
    
}
