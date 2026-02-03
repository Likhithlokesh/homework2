class Person{
    String name="yashas";
    int age = 21;
    void parent(){
    System.out.println("name:"+name);
    System.out.println("age:"+age);
    }

}

class Student extends Person {
    int rollNumber = 52;
    double marks = 70;
    void child(){
        System.out.println("Rollnumber:"+rollNumber);
        System.out.println("marks:"+marks);
    }

    
}




public class Code1 {
    
public static void main(String[] args) {
    
    Student st = new Student();
    st.child();
    st.parent();
}
}