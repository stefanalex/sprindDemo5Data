package com.warpit.springdemo5.domain.onetoone.bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Customer2")
@Table(name="Customer2")
public class Customer {
//owning side	

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_item")
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
