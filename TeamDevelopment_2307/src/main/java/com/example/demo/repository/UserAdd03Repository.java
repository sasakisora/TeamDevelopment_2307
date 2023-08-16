package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserAdd03;

/**
 * ユーザー情報 Repository
 */
@Repository
public interface UserAdd03Repository extends JpaRepository<UserAdd03, Long> {}