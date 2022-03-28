package com.warpit.springdemo5.domain.manytomany.custom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Customer21")
@Table(name="Customer21")
public class Customer {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="customer_item",
	           joinColumns = {@JoinColumn(name="customer_id")},
	           inverseJoinColumns = {@JoinColumn(name="item_id")}
	)
	private Set<Item> items = new HashSet<>();
	
	

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



	





	public Set<Item> getItems() {
		return items;
	}



	public void setItems(Set<Item> items) {
		this.items = items;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
	
}
