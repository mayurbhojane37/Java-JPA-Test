package com.jpaTest.LibraryManagementSystem;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Library {
	@Id
	private int lid;
	private String lname;
	private String branch;
	@OneToMany
	private List<Student> stud;
	
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(int lid, String lname, String branch, List<Student> stud) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.branch = branch;
		this.stud = stud;
	}
	@Override
	public String toString() {
		return "Library [lid=" + lid + ", lname=" + lname + ", branch=" + branch + ", stud=" + stud + "]";
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public List<Student> getStud() {
		return stud;
	}
	public void setStud(List<Student> stud) {
		this.stud = stud;
	}
	
}
