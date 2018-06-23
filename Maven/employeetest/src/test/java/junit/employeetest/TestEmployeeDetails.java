package junit.employeetest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestEmployeeDetails {
	
	EmpBusinessLogic empBusinessLogic;
	EmployeeDetails employee;
	
	@BeforeClass
	public void setupEmployee() throws Exception {
		empBusinessLogic = new EmpBusinessLogic();
		employee = new EmployeeDetails();
		employee.setName("Thavath");
		employee.setAge(25);
	}
	
	@Test
	public void testCalculateAppraisal500() {

		employee.setMonthlySalary(8000);
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}
	
	@Test
	public void testCalculateAppraisal1000() {

		employee.setMonthlySalary(10000);
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(1000,appraisal, 0.0);
	}
	
	@Test
	public void testCalculateYearlySalary() {

		employee.setMonthlySalary(8000);
		
		double salary = empBusinessLogic.calculateYearlySalary(employee);
		assertEquals(96000,salary, 0.0);
	}
}
