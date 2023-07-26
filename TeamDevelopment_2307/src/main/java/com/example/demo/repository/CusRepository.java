package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CusEntity;

/**
 * ユーザー情報 Repository
 */
public interface CusRepository extends JpaRepository<CusEntity, Long> {}
