package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.HouseEntity;

/**
 * ユーザー情報 Repository
 */

public interface HouseeditRepository extends JpaRepository<HouseEntity, Long> {}