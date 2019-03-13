/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muhiza.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author MacIvan
 */
public class Department {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String DeptName;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setFirstName(String DeptName) {
		this.DeptName = DeptName;
	}



	


	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", DeptName=" + DeptName + "]";
	}

}



    

