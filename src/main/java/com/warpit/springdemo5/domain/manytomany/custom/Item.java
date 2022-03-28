package com.warpit.springdemo5.domain.manytomany.custom;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="Item21")
@Table(name="Item21")
public class Item {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	
	
	public Item(String name) {
		super();
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
