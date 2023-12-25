package defaultmethod;
public interface Animal {
    default void  canRun(){
        System.out.println("canRun Animal");
    }
}
