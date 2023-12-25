package functionInterface;

public class ImplUsing_LambdaExpressions {
	public static void main(String[] args) {
		functionalInterface a1 = (str) -> System.out.println(str);
		functionalInterface a2 = (str) -> {System.out.println(str);};
		a1.say("Impl using lambda exp");
	}
}
 