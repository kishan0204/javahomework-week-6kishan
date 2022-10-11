package javahomework;

public class JavaProgrammes1 {      //1.1 Declare two instance variables.
    int a = 20;
    int b = 30;


    //instance method
    public void test() {
        JavaProgrammes1 obj = new JavaProgrammes1();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
//1.3 Call both instance variables into the instance method inside the print statement.
    public static void main(String[] args) {
        JavaProgrammes1 obj = new JavaProgrammes1();
        obj.test();


    }


}