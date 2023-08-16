package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserSearchEntity;

/**
 * ユーザー情報 Repository
 */
public interface UserSearchRepository extends JpaRepository<UserSearchEntity, Long> {

    List<UserSearchEntity> findByNameContainingIgnoreCaseOrAddressContainingIgnoreCase(String nameKeyword, String addressKeyword);
}