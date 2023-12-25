package optionalclass1;
import java.util.Optional;

public class Person {


    private String name;
    private int age;
    private String password;
    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    public Optional<String> getPassword() {
        return Optional.ofNullable(password);
    }


    public static void main(String[] args) {
        Person person = new Person("john", 26,"abc");
        Optional<Person> personOptional = Optional.of(person);

        Optional<Optional<String>> nameOptionalWrapper = personOptional.map(Person::getName);
        Optional<String> nameOptional = nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);
        String name1 = nameOptional.orElse("");
        System.out.println(name1);
        //String name = personOptional.flatMap(Person::getName).orElse("");
    }
}
