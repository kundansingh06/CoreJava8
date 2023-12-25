package FI;
interface B{
    public void m1();
}
public class FIImplementation {
    public static void main(String[] args) {
        B b=()-> System.out.println("ok");
        b.m1();
    }
}
