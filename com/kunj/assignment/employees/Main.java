package com.kunj.assignment.employees;


public class Main {
 public static void main(String[] args) {
     // Creating a Manager instance
     Manager manager = new Manager("Kunj Fuletra", 101, 80000.0, "Human Resources");
     manager.setDepartment("Finance");


     Developer developer = new Developer("Akash Patel", 102, 60000.0, "Java");
     developer.setProgrammingLanguage("Python"); // 
     
     System.out.println("Manager Details:");
     System.out.println("Name: " + manager.getName());
     System.out.println("Employee ID: " + manager.getEmployeeId());
     System.out.println("Salary: $" + manager.getSalary());
     System.out.println("Department: " + manager.getDepartment());

     System.out.println();

     System.out.println("Developer Details:");
     System.out.println("Name: " + developer.getName());
     System.out.println("Employee ID: " + developer.getEmployeeId());
     System.out.println("Salary: $" + developer.getSalary());
     System.out.println("Programming Language: " + developer.getProgrammingLanguage());
 }
}
