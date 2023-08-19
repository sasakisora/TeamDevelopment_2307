package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.HsEntity;

/**
 * ユーザー情報 Repository
 */
public interface HsRepository extends JpaRepository<HsEntity, Long> {
	
	@Query(value = "SELECT * FROM houses", nativeQuery = true)
    List<HsEntity> findAllHouses();

    List<HsEntity> findByNameContainingIgnoreCaseOrAddressContainingIgnoreCase(String nameKeyword, String addressKeyword);
}