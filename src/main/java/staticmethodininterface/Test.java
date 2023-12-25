package staticmethodininterface;
interface A {
    public static void m1(){
        System.out.println("I am Interface's static method");
    }
}
class Test1 implements A {
    public static void m1(){
        System.out.println("I am not an overridden method");
    }
}
class Test2 implements A {
    public void m1(){
        System.out.println("I am not an overridden method");
    }
}

class Test3 implements A {
    private static void m1(){
        System.out.println("I am not an overridden method");
    }
}
public class Test {
    public static void main(String[] args) {

    }
}
