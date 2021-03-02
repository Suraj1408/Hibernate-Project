package com.hw.servicrImpli;

import java.util.List;

import com.hw.dao.dao;
import com.hw.daoImpli.daoimplementation;
import com.hw.model.Student;
import com.hw.service.service;

public class serviceimplementation implements service{

	dao d= new daoimplementation();
	@Override
	public void add(Student s) {
		d.add(s);
	}

	@Override
	public List<Student> Logincheck(String un, String pw) {
		
		List<Student> list= d.Logincheck(un, pw);
		return list;
	}

	@Override
	public List<Student> getAllData() {
			
	List<Student> list=	d.getAllData();
	return list;
		
	}



	@Override
	public Student update(Student s) {
		
		Student stu=d.update(s);
		return stu;
		
		
	}

	@Override
	public void del(String id) {
	
		d.del(id);
	}

	@Override
	public Student edit(String id) {
		
		Student stu=d.edit(id);
		return stu;
	}

}
