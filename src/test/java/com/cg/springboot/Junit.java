package com.cg.springboot;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.springboot.entity.Department;
import com.cg.springboot.entity.Staff;
import com.cg.springboot.repository.DepartmentRepository;
import com.cg.springboot.service.DepartmentService;
import com.cg.springboot.service.DepartmentServiceImpl;
@SpringBootTest
public class Junit {

	Department d = new Department("Science", "arts", "commerce", 101);
	Staff staff = new Staff(11, "Ram", "Singh", "1234567890", d);
	DepartmentService service = new DepartmentServiceImpl();
	private static DepartmentService serv;
	private static DepartmentRepository repo;

	@BeforeAll
	public static void setUpTestEnv() {
		repo = Mockito.mock(DepartmentRepository.class); // ----? mock() method will create dummy object of dummy class
		serv = Mockito.mock(DepartmentServiceImpl.class); // which is implements AccountDAO interface
// serv = new DepartmentServiceImpl(departmentDaoMock);
		serv = (DepartmentService) new Department("Sci", "Arts", "Comm", 102);
	}

	@Test
	public void testDepartmentScience() {
		assertEquals(d.getScience(), "Science");
	}

	@Test
	public void testDepartmentArts() {
		assertEquals(d.getArts(), "arts");
	}

	@Test
	public void testDepartmentCommerce() {
		assertEquals(d.getCommerce(), "commerce");
	}

	@Test
	public void testDepartmentId() {
		assertEquals(d.getDeptId(), 101);
	}

	@Test
	public void testStaffId() {
		assertEquals(staff.getId(), 11);
	}

	@Test
	public void testStaffFirstName() {
		assertEquals(staff.getFirstName(), "Ram");
	}

	@Test
	public void testStaffLastName() {
		assertEquals(staff.getLastName(), "Singh");
	}

	@Test
	public void testStaffPhoneNo() {
		assertEquals(staff.getPhone(), "1234567890");
	}

	@Test
	public void testSaveDepartment() {
		assertEquals(service.saveDepartment(d), d);
	}

	@Test
	public void testDepartmentById() {
		assertEquals(service.getDepartmentById(101), d);
	}

	@Test
	public void testUpdateDepartment() {
		d = new Department("Sci", "Arts", "Comm", 102);
		assertEquals(service.updateDepartment(d, 102), d);
	}

	@Test
	public void testMockSaveDepartment() {
		assertEquals(serv.saveDepartment(d), d);
	}

	@Test
	public void testMockDepartmentById() {
		assertEquals(serv.getDepartmentById(101), serv);
	}

}
