/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muhiza.dao;
/**
 *
 * @author Ritah
 */
import java.util.List;

import org.hibernate.SessionFactory;

import com.muhiza.model.Department;

public interface DepartmentDAO {
	
	
	// save the record
		long save(Department department);
		
		// get a single record
		Department get(long id);
		
		// get all books records
		List<Department> list();
		
		//update a book
		void update(long id, Department employee);
		
		// deleting a book
		
		void delete(long id);
}
