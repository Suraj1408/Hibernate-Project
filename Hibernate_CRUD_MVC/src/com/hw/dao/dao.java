package com.hw.dao;

import java.util.List;

import com.hw.model.Student;

public interface dao {
	public void add(Student s);
	public List<Student> Logincheck(String un,String pw);
	public List<Student> getAllData();
	public Student edit(String id);
	public Student update(Student s);
	public void del(String id);
}
