package com.warpit.springdemo5.domain.onetoone.jointable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Customer3")
@Table(name="Customer3")
public class Customer {
//owning side	

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="customer_item",
	           joinColumns= {@JoinColumn(name="customer_id")},
	           inverseJoinColumns= {@JoinColumn(name="item_id")}
	          )
	private Item item;
	
	

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



	public Item getItem() {
		return item;
	}



	public void setItem(Item item) {
		this.item = item;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
	
}
