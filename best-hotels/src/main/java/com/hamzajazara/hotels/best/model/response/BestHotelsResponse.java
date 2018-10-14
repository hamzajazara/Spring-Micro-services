package com.hamzajazara.hotels.best.model.response;

import java.util.ArrayList;
import java.util.List;

import com.hamzajazara.hotels.best.entity.HotelEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Hamza Aljazara
 *
 */
@ApiModel("Best Hotels Response")
@Setter
@Getter
public class BestHotelsResponse {

	@ApiModelProperty("Hotel Name")
	private String hotelName;

	@ApiModelProperty("Rate")
	private int rate;

	@ApiModelProperty("Fare")
	private double fare;

	@ApiModelProperty("Amenities")
	private String amenities;

	/**
	 * 
	 * @param hotelEntity
	 */
	public BestHotelsResponse(HotelEntity hotelEntity) {
		hotelName = hotelEntity.getName();
		rate = hotelEntity.getRate();
		fare = hotelEntity.getPrice() != 0 ? Math.round(hotelEntity.getPrice() * 100) / 100 : 0;

		// Fetch amenities from hotel rooms
		List<String> amenitiesResult = new ArrayList<>();

		// Retrieve room info
		hotelEntity.getRooms().forEach(room -> {
			room.getAmenities().forEach(amenity -> {
				amenitiesResult.add(amenity.getName());
			});
		});
		amenities = String.join(", ", amenitiesResult);
	}
}
