package com.warpit.springdemo5.repository.onetoone;

import com.warpit.springdemo5.domain.*;
import com.warpit.springdemo5.domain.onetoone.unidirectional.Customer;
import com.warpit.springdemo5.domain.onetoone.unidirectional.Item;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
