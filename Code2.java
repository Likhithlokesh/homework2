class Student{
    private String name;
    private double marks;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
        System.out.println("name : "+name);
    }
    public double getmarks(){
        return marks;

    }
    public void setmarks(double marks){
        this.marks=marks;
        if(marks>=1){
            System.out.println("marks : " +marks);
        }else{
            System.out.println("marks should be positive ");
        }

    }


}


public class Code2 {
    public static void main(String[] args) {
        Student st = new Student();
        st.setname("yashas");
        st.setmarks(35);
        
    }
    
}
