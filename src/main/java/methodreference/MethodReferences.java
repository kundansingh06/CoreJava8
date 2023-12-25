package methodreference;

//Reference to a static method.
//Reference to an instance method.
//Reference to a constructor.
   interface Sayable {
	     void say();
      }
   
   interface Messageable{  
	    Message getMessage(String msg);  
	} 

   class Message{  
	    Message(String msg){  
	        System.out.print(msg);  
	    }  
	}  

  public class MethodReferences {
	MethodReferences(String msg) {
		System.out.print(msg);
	}
	// static method
	public static void staticM() {
		System.out.println("Hello, this is static method.");
	}
	// nonStatic method
	public void nonStatic() {
		System.out.println("Hello, this is non-static method.");
	}

	public void printnMsg() {
		System.out.println("Hello, this is instance method");
	}

	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = MethodReferences::staticM;
		sayable.say();

		Sayable sayable2 = new MethodReferences("A")::nonStatic; // You can use anonymous object also
		sayable2.say();
		
		Messageable hello = Message::new;  
        hello.getMessage("Hello");  

	}
}
