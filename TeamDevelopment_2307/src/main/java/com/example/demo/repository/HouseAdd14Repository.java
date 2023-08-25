package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.House;

/**
 * ユーザー情報 Repository
 */
@Repository
public interface HouseAdd14Repository extends JpaRepository<House, Long> {}