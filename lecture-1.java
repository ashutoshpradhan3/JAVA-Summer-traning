import java.util.Scanner;

class ObjClasses {
    
    public static void fun() {
        System.out.println("This is an example of function in java");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ObjClasses is a class in java");

        ObjClasses obj = new ObjClasses();
        System.out.println("obj is an example of object in java");
        obj.fun(); 
    }
}
