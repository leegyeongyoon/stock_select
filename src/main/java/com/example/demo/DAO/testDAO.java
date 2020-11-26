package com.example.demo.DAO;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;

@Repository
@Getter
@Setter
public class testDAO {
	@Autowired
	private ArrayList red_data = new ArrayList(); 
	private ArrayList name = new ArrayList();
	
	public ArrayList  getRed_data() {
		return red_data;
	}
	public void setRed_data(String red_data) {
		this.red_data.add(red_data);
	}
	
	public ArrayList  getName() {
		return name;
		}
	public void setName(String name) {
		this.name.add(name);
		}
}
