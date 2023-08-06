package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.HouseEntity;

/**
 * ユーザー情報 Repository
 */
@Repository
public interface HouseeditRepository extends JpaRepository<HouseEntity, Long> {}