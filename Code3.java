class Employee{
    private int salary;
    public int getsalary(){
        return salary;
    }
    public void setsalary(int salary){
        this.salary=salary;
        if(salary>0){
            System.out.println("salary of the employee is : "+salary);
        }else{
            System.out.println("salary cannot be negetive");
        }

    }
}



public class Code3 {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.setsalary(20000);
    }
}