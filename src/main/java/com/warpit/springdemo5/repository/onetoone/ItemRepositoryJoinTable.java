package com.warpit.springdemo5.repository.onetoone;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warpit.springdemo5.domain.onetoone.jointable.Item;





public interface ItemRepositoryJoinTable extends JpaRepository<Item,Integer>{

}
