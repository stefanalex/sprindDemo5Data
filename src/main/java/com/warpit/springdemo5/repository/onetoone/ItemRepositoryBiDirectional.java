package com.warpit.springdemo5.repository.onetoone;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warpit.springdemo5.domain.onetoone.bidirectional.Item;



public interface ItemRepositoryBiDirectional extends JpaRepository<Item,Integer>{

}
