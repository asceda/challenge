package com.project.questapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface ITquestRepo extends JpaRepository<questap, Long>{

}
