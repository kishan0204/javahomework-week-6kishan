package javahomework;

public class JavaProgrammes3 {
    int a=20; //3.1 Declare one instance and
    static int b =30; //one static variable.

    public static void test(){  // static methode
        JavaProgrammes3 obj = new JavaProgrammes3();
        System.out.println(obj.a);
        System.out.println(b);
    }
    public void test2(){ // (instance method)
        JavaProgrammes3 obj1=new JavaProgrammes3();
        System.out.println(a);
        System.out.println(obj1.b);

    }
//Declare the Main method.
    public static void main(String[] args) {
        JavaProgrammes3 obj3=new JavaProgrammes3();
        test();
        obj3.test2();
    }
}
