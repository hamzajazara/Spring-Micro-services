package com.hamzajazara.hotels.best.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hamzajazara.hotels.best.entity.HotelEntity;
import com.hamzajazara.hotels.best.model.request.BestHotelsRequest;

/**
 * 
 * @author Hamza Aljazara
 *
 */
@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Integer> {

	/**
	 * 
	 * @param hotelsRequest
	 * @return
	 */
	@Query("select h from hotel h join h.rooms r where h.city like :#{#hotelsRequest.city} And r.adultsCount = :#{#hotelsRequest.numOfAdults} And r.fromDate >= :#{#hotelsRequest.fromDate} And r.toDate <= :#{#hotelsRequest.toDate}")
	List<HotelEntity> getBesthotels(@Param("hotelsRequest") BestHotelsRequest hotelsRequest);
}
