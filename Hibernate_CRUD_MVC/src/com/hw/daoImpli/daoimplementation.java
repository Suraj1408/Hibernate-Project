package com.hw.daoImpli;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import org.hibernate.Session;

import com.hw.dao.dao;
import com.hw.model.Student;
import com.hw.utility.HibernateUtil;

public class daoimplementation implements dao{

	@Override
	public void add(Student s) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		session.save(s);
		session.beginTransaction().commit();
	}

	@Override
	public List<Student> Logincheck(String un, String pw) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Student stu=session.get(Student.class, un);
		List<Student> list= new ArrayList<Student>();
		list.add(stu);
		return list;
	}

	@Override
	public List<Student> getAllData() {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<Student> list=session.createQuery("from Student",Student.class).getResultList();
		
		return list;
	}

	
	@Override
	public Student update(Student s) {
		
				Session session= HibernateUtil.getSessionFactory().openSession();
				Student stu= session.get(Student.class, s.getUsername());
		
		stu.setRollno(s.getRollno());
		stu.setName(s.getName());
		stu.setAddress(s.getAddress());
		stu.setPassword(s.getPassword());
		stu.setGender(s.getGender());
		stu.setCity(s.getCity());
	
		session.update(stu);
		session.beginTransaction().commit();
		
		Student stud=session.get(Student.class, s.getUsername());
		return stud;
	}

	@Override
	public Student edit(String id) {
		Session session =HibernateUtil.getSessionFactory().openSession();
		
		Student stu= session.get(Student.class, id);
		
		return stu;
	}

	@Override
	public void del(String id) {
	
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Student s= session.get(Student.class, id);
		//session.createNamedQuery("delete Student where username=:uname").setParameter("uname", uname);
		session.delete(s);
		session.beginTransaction().commit();
		
	}

	
}
