package javahomework;

public class JavaProgrammes4 {
    int a=1;  //4.1 Declare two instance and
    int b=2;
    static int c=3; //two static variables.
    static int d=4;

    //Declare one instance method.
    public void test(){
        JavaProgrammes4 obj = new JavaProgrammes4();
        System.out.println(a);
        System.out.println(b);
        System.out.println(obj.c);
        System.out.println(obj.d);

    }
    //Declare one static method.
    public static void test1(){
        JavaProgrammes4 obj2 = new JavaProgrammes4();
        System.out.println(c);
        System.out.println(d);
        System.out.println(obj2.a);
        System.out.println(obj2.b);


    }
    //4.5 Declare the Main method.

    public static void main(String[] args) {
        JavaProgrammes4 obj = new JavaProgrammes4();
        test1();
        obj.test();



    }

}
