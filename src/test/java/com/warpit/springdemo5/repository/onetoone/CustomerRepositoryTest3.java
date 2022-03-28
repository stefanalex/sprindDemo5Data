package com.warpit.springdemo5.repository.onetoone;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

import com.warpit.springdemo5.domain.onetoone.jointable.Customer;
import com.warpit.springdemo5.domain.onetoone.jointable.Item;
import com.warpit.springdemo5.repository.onetoone.CustomerRepositoryJoinTable;





@DataJpaTest
@Transactional
class CustomerRepositoryTest3 {
	
	
	@Autowired CustomerRepositoryJoinTable customerRepository;
	
	
	
    @BeforeEach
    void setUp() {
    	
    	
    }
	
	
    @Test
    public void injectedComponentsAreNotNull(){
	        assertThat(customerRepository).isNotNull();
    }
	
	@Test
	void findCustomerById() {
		Customer customer = new Customer("Customer2");
    	Item item = new Item("Item2");
     	customer.setItem(item);
     	customerRepository.save(customer);
		assertThat(customerRepository.findById(customer.getId())).hasValue(customer);
	}
	

}
