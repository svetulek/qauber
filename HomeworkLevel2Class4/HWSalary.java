package HomeworkLevel2Class4;

import java.util.ArrayList;

public class HWSalary {
public static void main(String[] args)  {
	ArrayList<Employee> employees = new ArrayList<Employee>();
	Employee e1 = new Employee("John",1000,1);
	Employee e2 = new Employee("Karen",700,2);
	Manager m = new Manager ("Steven", 1500,3,700);
	
	employees.add(e1);
	employees.add(e2);
	employees.add(m);
	
	double totalSalary = 0;
	
	for(Employee e: employees){
		totalSalary =totalSalary + e.getSalary();
	}
	System.out.println(totalSalary);
	}
	
}

