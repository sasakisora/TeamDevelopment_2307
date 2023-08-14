package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserEditEntity;
/**
 * ユーザー情報 Repository
 */
@Repository
public interface UserRepositoryS7 extends JpaRepository<UserEditEntity, Long> {}