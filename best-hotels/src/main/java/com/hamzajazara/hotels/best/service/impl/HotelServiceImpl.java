package com.hamzajazara.hotels.best.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzajazara.hotels.best.entity.HotelEntity;
import com.hamzajazara.hotels.best.model.request.BestHotelsRequest;
import com.hamzajazara.hotels.best.repository.HotelRepository;
import com.hamzajazara.hotels.best.service.HotelService;

/**
 * 
 * @author Hamza Aljazara
 *
 */
@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	/*
	 * @see
	 * com.hamzajazara.hotels.best.service.HotelService#searchHotels(com.hamzajazara
	 * .hotels.best.model.request.BestHotelsRequest)
	 */
	@Override
	public List<HotelEntity> searchHotels(BestHotelsRequest hotelsRequest) {
		return hotelRepository.getBesthotels(hotelsRequest);
	}
}
