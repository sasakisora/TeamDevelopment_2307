package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.House;

public interface HouseRepository extends JpaRepository<House, Long> {
    @Query("SELECT h FROM House h WHERE h.name LIKE %:keyword% OR h.address LIKE %:keyword%")
    List<House> findByKeyword(@Param("keyword") String keyword);
}
