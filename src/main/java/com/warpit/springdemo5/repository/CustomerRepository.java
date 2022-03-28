package com.warpit.springdemo5.repository;

import com.warpit.springdemo5.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
