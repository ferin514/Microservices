package com.UST.springbootEmployee.repository;

import com.UST.springbootEmployee.model.springbootModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface springbootRepo extends JpaRepository<springbootModel,Integer> {
}
