package javaSetCollections;

import java.util.HashSet;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {


		Set<Employee> employeeList = new HashSet<Employee>();

		employeeList.add(new Employee(101, "dinesh", "Tester"));
		employeeList.add(new Employee(111, "sham", "Architect"));
		employeeList.add(new Employee(102, "kumar", "Senior Recruiter"));
		employeeList.add(new Employee(105, "raj", "Java Developer"));
		employeeList.add(new Employee(109, "rakesh", "Business Anylyst"));
		employeeList.add(new Employee(101, "dinesh", "Tester"));


		for(Employee employee: employeeList)
		{
			System.out.println(employee.toString());
		}

		System.out.println("=====================================================");

		employeeList.remove(new Employee(101, "dinesh", "Tester"));

		for(Employee employee: employeeList)
		{
			System.out.println(employee.toString());
		}

		

	}

}
