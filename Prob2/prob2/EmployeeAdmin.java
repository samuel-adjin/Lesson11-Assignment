package prob1;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		final int SALARY_GREATER = 80000;
		Collection<Employee> employees = table.values();
		List<Employee> reports = new ArrayList<>();
		for (Employee employee : employees) {
			int salary = employee.getSalary();
			String ssn = employee.getSsn();
			if (salary > SALARY_GREATER && socSecNums.contains(ssn)) {
				reports.add(employee);
			}
		}
		Comparator<Employee> employeeComparator = new EmployeeComparator();
		reports.sort(employeeComparator);
		return reports;
	}
	
}
