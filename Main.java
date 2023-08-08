package com.jsp.Myproject;

public class Main {

	public static void main(String[] args) {
		EmployeeManagementSystem system=new EmployeeManagementSystem();
		system.addEmployee(new Employee(101,"Xyz",3000));
		system.addEmployee(new Employee(102,"Rkd",5000));
		system.addEmployee(new Employee(103,"Ykd",7000));
		
		System.out.println("Initial Employee list");
		system.displayAllEmployees();
		
		//Updating an employee
		Employee updatedEmployee=new Employee(102, "Jane Doe", 65000);
		system.updateEmployee(102, updatedEmployee);
		
		//Removing an employee
		system.removeEmployee(103);
		
		//Displaying employees after the update and removal
		System.out.println("\nEmployee list after updating and removing:");
		system.displayAllEmployees();
		
		//Searching for an employee
		int searchId =101;
		Employee searchedEmployee =system.findEmployee(searchId);
		if(searchedEmployee !=null) {
			System.out.println("\nEmployee with ID"+ searchId + "found" + searchedEmployee);
		}
		else {
			System.out.println("\nEmployee with ID " + searchId+ "not found");
		}
		}
}