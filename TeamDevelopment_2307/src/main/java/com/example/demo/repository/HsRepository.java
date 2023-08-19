package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.HsEntity;

/**
 * ユーザー情報 Repository
 */
public interface HsRepository extends JpaRepository<HsEntity, Long> {

    List<HsEntity> findByNameContainingIgnoreCaseOrAddressContainingIgnoreCase(String nameKeyword, String addressKeyword);
}