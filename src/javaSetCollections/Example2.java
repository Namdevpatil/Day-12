package javaSetCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example2 {

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

		Iterator<Employee> iterator = employeeList.iterator();
		
		while(iterator.hasNext())
		{
			Employee employee = iterator.next();
			
			if(employee.getId() == 101)
			{
				iterator.remove();
			}
			
		}
		
		for(Employee employee: employeeList)
		{
			System.out.println(employee.toString());
		}

		

	}

}
