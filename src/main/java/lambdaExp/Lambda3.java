package lambdaExp;
interface MyLambda {
	abstract public void demo();
//	abstract public int demo();
}
public class Lambda3 {
	static int temp = 5;
	int x = 2;
	public static void main(String[] args) {
		int n = 10;
		MyLambda lambda = new MyLambda() {
			@Override
			public void demo() {
				System.out.println("inside lambda demo, n is: " + n + "\nstatic field: " + temp + " instance filed: "
						+ new Lambda3().x);
			}
		};

		lambda.demo();

		/*
		 * MyLambda lambda11 = () -> 12;
		 * 
		 * System.out.println(lambda11.demo());
		 */
	}
}
