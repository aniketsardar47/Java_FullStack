package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mmcoe.dao.EmpDeptDao;
import com.mmcoe.entity.Department;
import com.mmcoe.entity.Employee;

public class testEmpDeptDao {
	
	public static EmpDeptDao dao;
	
	@BeforeEach
	public void init() {
		dao = new EmpDeptDao();
	}
	
	@Test
	public void testSaveDept() {
		Department d = new Department(50,"Development","Kolkata");
		assertNotNull(dao.saveDept(d));
	}
	
	@Test
	public void testSaveDeptEmps() {
		Department dept = new Department(60,"Marketing","Kolkata");
		
		Employee e1 = new Employee(601,"Nik","Manager",6000);
		Employee e2 = new Employee(602,"Ben","Clerk",5000);
		
		e1.setDept(dept);
		e2.setDept(dept);
		
		dept.getEmps().add(e1);
		dept.getEmps().add(e2);
		
		assertNotNull(dao.saveDept(dept));
		
	}
	
	@Test
	public void testSaveEmp() {
		Employee e = new Employee(103,"Michel","Developer",4300.23);
		assertNotNull(dao.saveEmp(e, 50));
	}
	
	@Test
	public void findEmp() {
		Employee e = dao.findEmp(101);
		assertNotNull(e);
		System.out.println(e);
		
		Department dept = e.getDept();
		System.out.println(dept);
	}
	
	@Test
	public void findDept() {
		Department d = dao.findDept(10);
		assertNotNull(d);
		System.out.println(d);
		
		List<Employee> emps = d.getEmps();
		emps.forEach(System.out::println);
	}
	
	@Test
	public void testDeleteDept() {
		assertTrue(dao.deleteDept(60));
	}
	
	
}