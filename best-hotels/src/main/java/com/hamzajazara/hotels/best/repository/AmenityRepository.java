package com.hamzajazara.hotels.best.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamzajazara.hotels.best.entity.AmenityEntity;

/**
 * 
 * @author Hamza Aljazara
 *
 */
@Repository
public interface AmenityRepository extends JpaRepository<AmenityEntity, Integer> {
}
