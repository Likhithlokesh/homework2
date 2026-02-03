public class Student{
    String name;
    int age;
    double marks;
     Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void run(){
        System.out.println(name + " " + age + " " + marks);
    }
}

public class Code1 {
    public static void main(String[] args) {
        Student st = new Student("yashas",21,70.00);
        st.run();

    }
    
} {
    
}
