package com.warpit.springdemo5.domain.onetoone.bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Item2")
@Table(name="Item2")
public class Item {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy ="item" )
	private Customer customer;

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
