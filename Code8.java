class Teacher{
    String name1 = "kkk";
    String name2 ="mmk";
    void teach1(){
        System.out.println("teacher name:"+name1);

    }
    void teach2(){
        System.out.println("teacher name:"+name2);
    }


}
class Mathteacher extends Teacher{
  void solveEquation(){
    System.out.println("i am math teacher");

  }
}
class Scienceteacher extends Teacher{
    void cunductExperiment(){
        System.out.println("i am science taecher");

    }

}



public class Code8 {
    
    public static void main(String[] args) {
        Mathteacher mt = new Mathteacher();
        Scienceteacher st = new Scienceteacher();
        mt.teach1();
        mt.solveEquation();
        st.teach2();
        st.cunductExperiment();
        
    }
}
