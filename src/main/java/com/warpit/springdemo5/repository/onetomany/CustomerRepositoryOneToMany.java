package com.warpit.springdemo5.repository.onetomany;


import org.springframework.data.jpa.repository.JpaRepository;

import com.warpit.springdemo5.domain.onetomany.case1.Customer;



public interface CustomerRepositoryOneToMany extends JpaRepository<Customer,Integer>{

}
