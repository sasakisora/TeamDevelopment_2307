package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CusDetEntity;
/**
 * ユーザー情報 Repository
 */

public interface CusDetRepository extends JpaRepository<CusDetEntity, Long> {}