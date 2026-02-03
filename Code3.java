import javax.sql.rowset.spi.SyncResolver;

class Animal{
 void eat(){
    System.out.println("animals are carnivores");
 }
}
class Dog extends Animal{
    void bark(){
        super.eat();
        System.out.println("Dog barks");
    }

}
class Puppy extends Dog{
    void weep(){
        super.bark();
        System.out.println("puppy weeps");
    }


}



public class Code3 {
    public static void main(String[] args) {
        Puppy pp = new Puppy();
        pp.weep();
    }
    
}
