package com.hamzajazara.hotels.best.service;

import java.util.List;

import com.hamzajazara.hotels.best.entity.HotelEntity;
import com.hamzajazara.hotels.best.model.request.BestHotelsRequest;

/**
 * 
 * @author Hamza Aljazara
 *
 */
public interface HotelService {

	/**
	 * 
	 * @param hotelRequest
	 * @return
	 */
	List<HotelEntity> searchHotels(BestHotelsRequest hotelsRequest);
}
