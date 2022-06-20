package org.emp;

public class Employee {
	private void empID() {
		System.out.println("Employee ID is 3456");
	}
	private void empName() {
		System.out.println("Employee Name is soundarya");

	}
	private void empDob() {
		System.out.println("Employee Dob is 14/6/1993");
	}

	private void empPhone() {
		System.out.println("Employee Phone is 9999");

	}

	private void empEmail() {
		System.out.println("Employee emaii is ABCD@gmail.com");

	}

	private void empAddress() {
		System.out.println("Employee Address is Ap");
	}
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		
		e.empAddress();
		e.empDob();
		e.empEmail();
		e.empID();
		e.empName();
		
	}
	
	
}
