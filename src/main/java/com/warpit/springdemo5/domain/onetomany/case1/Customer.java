package com.warpit.springdemo5.domain.onetomany.case1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Customer10")
@Table(name="Customer10")
public class Customer {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")  //this column will be added into Item
	private List<Item> items = new ArrayList<>();
	
	

	public Customer(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	



	public List<Item> getItems() {
		return items;
	}



	public void setItems(List<Item> items) {
		this.items = items;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
	
}
