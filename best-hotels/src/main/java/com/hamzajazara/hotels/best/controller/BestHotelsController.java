package com.hamzajazara.hotels.best.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamzajazara.hotels.best.entity.HotelEntity;
import com.hamzajazara.hotels.best.model.request.BestHotelsRequest;
import com.hamzajazara.hotels.best.model.response.BestHotelsResponse;
import com.hamzajazara.hotels.best.service.HotelService;

import io.swagger.annotations.Api;

/**
 * 
 * @author Hamza Aljazara
 *
 */
@RestController
@Api(tags = "Best Hotels")
public class BestHotelsController {

	@Autowired
	private HotelService hotelService;

	/**
	 * 
	 * @param hotelRequest
	 * @return
	 */
	@PostMapping("/search")
	public ResponseEntity<List<BestHotelsResponse>> crazyHotels(@Valid @RequestBody BestHotelsRequest hotelRequest) {
		// Response
		List<BestHotelsResponse> response = new ArrayList<>();

		// Get Hotels Service
		List<HotelEntity> hotels = hotelService.searchHotels(hotelRequest);

		// Iterate over response and put the result on response list
		hotels.forEach(hotel -> response.add(new BestHotelsResponse(hotel)));

		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
