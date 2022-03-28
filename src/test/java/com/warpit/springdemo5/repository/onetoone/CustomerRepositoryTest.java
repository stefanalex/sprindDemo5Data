package com.warpit.springdemo5.repository.onetoone;

import static java.util.Arrays.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

import com.warpit.springdemo5.domain.onetoone.unidirectional.Customer;
import com.warpit.springdemo5.domain.onetoone.unidirectional.Item;
import com.warpit.springdemo5.repository.onetoone.CustomerRepository;


@DataJpaTest
@Transactional
class CustomerRepositoryTest {
	
	
	@Autowired CustomerRepository customerRepository;
	
	
	
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
    	Item item = new Item("Item1");
     	customer.setItem(item);
     	customerRepository.save(customer);
		assertThat(customerRepository.findById(customer.getId())).hasValue(customer);
	}
	

}
