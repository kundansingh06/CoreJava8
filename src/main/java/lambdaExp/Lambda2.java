package lambdaExp;
public class Lambda2 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("I am inside thread1");
			}

		});
		thread1.setName("First thread");
		thread1.start();
		System.out.println(thread1.getName());
		// now using lambda expression
		Thread thread2 = new Thread(() -> System.out.println("inside lambda thread2"));
		thread2.start();
	}
}
