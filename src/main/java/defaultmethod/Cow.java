package defaultmethod;

public class Cow implements Animal{

    public void canRun(){
        System.out.println("canRun Cow");
    }

    public static void main(String[] args) {
        Cow c = new Cow();
        c.canRun();

        Animal a =new Cow();
        a.canRun();


    }
}
