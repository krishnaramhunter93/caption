package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dao.Vechile;
@Repository
public interface VechileRepository extends JpaRepository<Vechile, Long> {

}
