package FI;
interface A{
    public void m1();
}
class Demo implements A{
    @Override
    public void m1() {
        System.out.println("m1");
    }
}
public class NormalImpletation {
    public static void main(String[] args) {
        A d=new Demo();
        d.m1();
    }
}
