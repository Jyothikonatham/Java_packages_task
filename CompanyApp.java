package com.company.app;
import com.company.admin.Department;
import com.company.hr.Employee;
public class CompanyApp{
	public static void main(String[] args){
	Employee emp = new Employee();
	emp.setId(101);
	emp.setName("Varun");
	emp.setSalary(55000.00);
	
	Department dept = new Department();
	dept.setDeptName("Testers");
	dept.setDeptId(407);	emp.showEmployeeDetails();
	System.out.println();	
	dept.showDepartmentDetails();
	}
}