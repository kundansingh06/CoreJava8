package optionalclass1;

import java.util.Optional;

public class Student {

    public String getMyDefault() {
        System.out.println("Getting Default Value");
        return "KUNDAN SINGH";
    }

    public void orElse_orElseGet_null() {
        String text = null;
        System.out.println("Using orElse:");
        String defaultText = Optional.ofNullable(text).orElse(getMyDefault());
        System.out.println("Using orElseGet:");
        defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);
        System.out.println(defaultText);
    }

    public void orElse_orElseGet_notNull() {
        String text = "Text present";
        System.out.println("Using orElse:");
        String defaultText = Optional.ofNullable(text).orElse(getMyDefault());
        System.out.println("Using orElseGet:");
        defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);
        System.out.println(defaultText);
    }
    public void OrElseThrow() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);

    }

    public static void main(String[] args) {
        Student s =new Student();
        //s.orElse_orElseGet_null();
       //s.orElse_orElseGet_notNull();
        Optional<String>ofString = Optional.of("Bobby");
        System.out.println("Checking if ofString has value : " + ofString.isPresent());
        System.out.println(ofString.get());
        ofString.ifPresent((e) -> System.out.println(ofString.get()));
        Optional<String> stringOptional = Optional.of("Hi!");
        Optional<String> stringOptionalNull = Optional.empty();
        stringOptional.ifPresent(System.out::println); // prints "Hi!"
        stringOptionalNull.ifPresent(System.out::println); // prints nothing

        Optional<Integer>ofInt = Optional.of(1);
        System.out.println("Checking if ofInt has value : " + ofInt.isPresent());
        System.out.println(ofInt.get());

        Optional<Integer>empty = Optional.empty();
        System.out.println("Checking if empty has value : " + empty.isPresent());
       // System.out.println(empty.get()); //Exception in thread "main" java.util.NoSuchElementException: No value present
       // check if optional contains a value
        if(empty.isPresent()) {
            System.out.println(empty.get());
        }
        else{
            System.out.println("value is not present");
        }

        String nullName0 = "null";
        String name0 = Optional.ofNullable(nullName0).orElse("john");
        System.out.println("==0=="+name0);
        String nullName1 = null;
        String name1 = Optional.ofNullable(nullName1).orElseGet(() -> "john");
        System.out.println("==1=="+name1);

       //Optional<Object>ofNull = Optional.of(null);//we'll get a NullPointerException:
       //System.out.println("Checking if optional3 has value : " + ofNull.isPresent());

    String name = "baeldung";
    Optional<String> optWithNull = Optional.ofNullable(name);

    }
}
