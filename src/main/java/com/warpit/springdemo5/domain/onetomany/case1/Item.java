package com.warpit.springdemo5.domain.onetomany.case1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Item10")
@Table(name="Item10")
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
