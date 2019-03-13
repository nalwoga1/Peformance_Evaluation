/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muhiza.dao;

import com.muhiza.model.Department;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.muhiza.model.Employee;
/**
 *
 * @author MacIvan
 */
public class DepartmentDAOImpl implements DepartmentDAO {
    
	
	@Autowired
	private SessionFactory sessionFactory; 
	
	@Override
	public long save(Department department) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Department get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<Department> list() {
		List<Department> list = sessionFactory.getCurrentSession().createQuery("from Department").list();
		return list;
	}

	@Override
	public void update(long id, Department Department) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
