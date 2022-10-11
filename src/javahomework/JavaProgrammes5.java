package javahomework;
/*Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)*/
public class JavaProgrammes5 {
    //Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.(Note: Two static and Two instance methods.
//Two  instance
    public void Addition() {

        int a = 20, b = 10;
        int c = a + b;
        System.out.println("Addition  "+c);
    }

    public void subtraction() {
        int a = 20, b = 10;
        int c = a - b;
        System.out.println("subtraction  "+c);
    }
//Two  static
    public static void multiplication() {
        int a = 20, b = 10;
        int c = a * b;
        System.out.println("multiplication  "+c);
    }

    public static void division() {
        int a = 20, b = 10;
        int c = a / b;
        System.out.println("division  "+c);
    }


    public static void main(String[] args) {
   JavaProgrammes5 obj=new JavaProgrammes5();
       obj.Addition();
       obj.subtraction();

        multiplication();
        division();
    }
}
