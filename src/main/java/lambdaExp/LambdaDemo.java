package lambdaExp;

// scenario when we have only one declaration in the interface, we can use lambda

// this is functional interface
interface Lambda {
	public void demo();
}

public class LambdaDemo {

	public static void main(String[] args) {

		Lambda lambda = new Lambda() {

			@Override
			public void demo() {
				System.out.println("Statement 1");
			}
		};

		lambda.demo();

		// using lambda
		Lambda lambda2 = () -> System.out.println("Statement1 using lambda expression");

		lambda2.demo();

		System.out.println();
		
		Lambda lambda3 = () -> {
			System.out.println("statement 1");
			System.out.println("statement 2");
		};

		lambda3.demo();
	}
}
