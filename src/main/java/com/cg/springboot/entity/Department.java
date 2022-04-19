package com.cg.springboot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Department {
	private String science;
	private String arts;
	private String commerce;

	@Id
	private int deptId;

	@OneToMany(mappedBy = "department", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	
	@JsonManagedReference
	private List<Staff> staff;

//	@OneToMany(mappedBy="department",
//            cascade= {CascadeType.PERSIST,CascadeType.MERGE,
//                    CascadeType.DETACH,CascadeType.REFRESH})
//    private List<Staff> staff;
	public Department() {

	}

	public Department(String science, String arts, String commerce, int deptId) {
		super();
		this.science = science;
		this.arts = arts;
		this.commerce = commerce;
		this.deptId = deptId;
	}

	public String getScience() {
		return science;
	}

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	public void setScience(String science) {
		this.science = science;
	}

	public String getArts() {
		return arts;
	}

	public void setArts(String arts) {
		this.arts = arts;
	}

	public String getCommerce() {
		return commerce;
	}

	public void setCommerce(String commerce) {
		this.commerce = commerce;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Department [science=" + science + ", arts=" + arts + ", commerce=" + commerce + ", deptId=" + deptId
				+ "]";
	}

}
