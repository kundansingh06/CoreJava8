package stream.employee;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		/*ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(1, "A", "Bng", 200));
		emplist.add(new Employee(2, "B", "Mum", 400));
		emplist.add(new Employee(3, "C", "Kol", 600));
		emplist.add(new Employee(4, "D", "Del", 800));
		emplist.add(null);
		emplist.add(new Employee(5, "E", "che", 900));
		emplist.add(new Employee(6, "f", "che", 900));
		emplist.add(new Employee(7, "g", "che", 900));

		
		Map<String, List<Employee>> groupByCity = emplist.stream().collect(Collectors.groupingBy(Employee::getCity));
		//emap.forEach((k, v) -> System.out.println(k + "" + v));
		System.out.println(groupByCity);
		
       //print emp name whose salary ==200
		emplist.stream().filter(a -> a.getSalary() == 200).forEach(a -> System.out.println(a.name));
		
		//print all list of salary greater than 600
		emplist.stream().filter(p -> p.getSalary() > 600)
		.map(p -> p.getSalary())
		.collect(Collectors.toList()).forEach(System.out::println);
		
		//summing all salary
		double totalPrice3 = emplist.stream().collect(Collectors.summingDouble(a -> a.getSalary()));
		System.out.println(totalPrice3);
		
		//get max salary
		Employee employeeMax = emplist.stream().max((a, b) -> a.getSalary() > b.getSalary() ? 1 : -1).get();
		System.out.println(employeeMax.getSalary());
		
	
		//get min salary
		Employee employeeMin = emplist.stream().min((a, b) -> a.salary > b.salary ? 1 : -1).get();
		System.out.println(employeeMin.salary);

		
	   //count number of employee salary greater tahn 800
		long count = emplist.stream().filter(a->a.salary>800).count();  
        System.out.println(count);

		List<Employee> salarygreaterthan900 = emplist.stream()
				.filter(person -> person.getSalary() >= 900)
				.collect(Collectors.toList());
		salarygreaterthan900.forEach(a -> System.out.println(a.getName()));
		List<Employee> nullemp = emplist.stream()
				.filter(person -> person != null)
				.collect(Collectors.toList());
        
        
        
        List<Integer> listOfSalary = emplist.stream().map(a->a.getSalary()).sorted().collect(Collectors.toList());
     
        listOfSalary.stream().skip(1).limit(2).collect(Collectors.toList());
        listOfSalary.stream().mapToInt(x->x).summaryStatistics().getAverage();
        listOfSalary.stream().mapToInt(x->x).summaryStatistics().getCount();
        listOfSalary.stream().mapToInt(x->x).summaryStatistics().getMax();
        listOfSalary.stream().mapToInt(x->x).summaryStatistics().getMin();
        listOfSalary.stream().mapToInt(x->x).summaryStatistics().getSum();
    
        
        emplist.sort(Comparator.comparing(Employee::getCity));
		emplist.sort(Comparator.comparing(Employee::getCity).reversed());
		Comparator<Employee> thenComparing = Comparator.comparing(Employee::getId).thenComparing(Employee::getCity);
		emplist.sort(thenComparing);
		*/
		
	}
}
