package com.warpit.springdemo5.repository.onetomany;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

import com.warpit.springdemo5.domain.onetomany.case1.Customer;
import com.warpit.springdemo5.domain.onetomany.case1.Item;




@DataJpaTest
@Transactional
class CustomerRepositoryTest {
	
	
	@Autowired CustomerRepositoryOneToMany customerRepository;
	
	
	
    @BeforeEach
    void setUp() {
    	
    	
    }
	
	
    @Test
    public void injectedComponentsAreNotNull(){
	        assertThat(customerRepository).isNotNull();
    }
	
	@Test
	void findCustomerById() {
		Customer customer = new Customer("Customer1");
    	Item item1 = new Item("Item1");
    	Item item2 = new Item("Item2");
     	customer.getItems().add(item1);
     	customer.getItems().add(item2);
     	customerRepository.save(customer);
		assertThat(customerRepository.findById(customer.getId())).hasValue(customer);
	}
	

}
