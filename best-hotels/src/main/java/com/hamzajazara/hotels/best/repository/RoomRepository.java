package com.hamzajazara.hotels.best.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamzajazara.hotels.best.entity.RoomEntity;

/**
 * 
 * @author Hamza Aljazara
 *
 */
@Repository
public interface RoomRepository extends JpaRepository<RoomEntity, Integer> {
}
