package com.hibernate.examples;

public class Test {
	public static void main(String[] args) {
		Employee ram = new Employee();
		ram.setId(1001);
		ram.setName("Ram");
		ram.setSalary(90000);
		EmployeeDAO empDAO = new EmployeeDAO();
		String message = empDAO.addNewEmployee(ram);
		System.out.println("Message is "+message);
	}
}
