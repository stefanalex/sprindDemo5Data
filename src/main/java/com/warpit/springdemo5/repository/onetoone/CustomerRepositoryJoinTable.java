package com.warpit.springdemo5.repository.onetoone;

import com.warpit.springdemo5.domain.*;
import com.warpit.springdemo5.domain.onetoone.jointable.Customer;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepositoryJoinTable extends JpaRepository<Customer,Integer>{

}
