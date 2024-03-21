package com.kunj.assignment.employees;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     
	 Scanner sc = new Scanner(System.in);
	 Employee[] e = new Employee[5];
	 String name;
	 int id;
	 int salary;
	 for (int j=0;j<e.length;j++) {
		 e[j] = new Employee();
	 }
	 
	 for(int i=0;i<e.length;i++) {
		 
		 System.out.println("Enter Details employee number : " +(i+1));
		 System.out.print("Enter name : ");
		 name = sc.next();
		 e[i].setName(name);
		 
		 System.out.print("Enter employee id : ");
		 id = sc.nextInt();
		 e[i].setEmployeeId(id);
		 
		 System.out.print("Enter employee salary : ");
		 salary = sc.nextInt();
		 e[i].setSalary(salary);
		 
		 System.out.println("_________________________________________________________");
		 
	 }
	 

	 for(int i=0;i<e.length;i++) {
		 System.out.println("Details employee number : " +(i+1));
		 System.out.println("Enter name : " + e[i].getName());
		 System.out.println("Id : " + e[i].getEmployeeId());
		 System.out.println("Enter name : " + e[i].getSalary());
		 System.out.println("_________________________________________________________");
		 
		 
		 
		 
	 }
	 
	 
//   Manager manager = new Manager("Kunj Fuletra", 101, 80000.0, "Human Resources");
//   manager.setDepartment("Finance");
//
//
//   Developer developer = new Developer("Akash Patel", 102, 60000.0, "Java");
//   developer.setProgrammingLanguage("Python"); // 
//   
//   System.out.println("Manager Details:");
//   System.out.println("Name: " + manager.getName());
//   System.out.println("Employee ID: " + manager.getEmployeeId());
//   System.out.println("Salary: $" + manager.getSalary());
//   System.out.println("Department: " + manager.getDepartment());
//
//   System.out.println();
//
//   System.out.println("Developer Details:");
//   System.out.println("Name: " + developer.getName());
//   System.out.println("Employee ID: " + developer.getEmployeeId());
//   System.out.println("Salary: $" + developer.getSalary());
//   System.out.println("Programming Language: " + developer.getProgrammingLanguage());
 }
}
