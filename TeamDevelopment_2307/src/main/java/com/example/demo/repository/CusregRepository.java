package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CusEntity;

/**
 * 顧客情報 Repository
 */
@Repository
public interface CusregRepository extends JpaRepository<CusEntity, Long> {
    // ここにCusregRepository独自のメソッドを定義する場合は追加してください
    // 例：CusEntity findBySomeProperty(String someProperty);
}
