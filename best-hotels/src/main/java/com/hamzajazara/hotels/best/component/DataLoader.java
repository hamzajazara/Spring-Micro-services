package com.hamzajazara.hotels.best.component;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.hamzajazara.hotels.best.entity.AmenityEntity;
import com.hamzajazara.hotels.best.entity.HotelEntity;
import com.hamzajazara.hotels.best.entity.RoomEntity;
import com.hamzajazara.hotels.best.repository.AmenityRepository;
import com.hamzajazara.hotels.best.repository.HotelRepository;
import com.hamzajazara.hotels.best.repository.RoomRepository;

/**
 * 
 * @author Hamza Aljazara
 *
 */
@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private HotelRepository hotelRepository;

	@Autowired
	private RoomRepository roomRepository;

	@Autowired
	private AmenityRepository amenityRepository;

	/*
	 * @see org.springframework.boot.ApplicationRunner#run(org.springframework.boot.
	 * ApplicationArguments)
	 */
	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Hotels
		HotelEntity hotel1 = hotelRepository
				.saveAndFlush(HotelEntity.builder().id(1).name("Best Hotel 1").price(90).rate(2).city("Faro").build());

		HotelEntity hotel2 = hotelRepository.saveAndFlush(
				HotelEntity.builder().id(2).name("Best Hotel 2").price(250).rate(5).city("Kribi").build());

		HotelEntity hotel3 = hotelRepository.saveAndFlush(
				HotelEntity.builder().id(3).name("Best Hotel 2").price(250).rate(5).city("Ambler").build());

		HotelEntity hotel4 = hotelRepository.saveAndFlush(
				HotelEntity.builder().id(4).name("Best Hotel 2").price(250).rate(5).city("Exeter").build());

		// Rooms
		RoomEntity room1 = roomRepository
				.saveAndFlush(RoomEntity.builder().id(1).name("Best Room 1").fromDate(LocalDate.of(2018, 10, 1))
						.toDate(LocalDate.of(2018, 10, 10)).adultsCount(5).hotel(hotel1).build());

		RoomEntity room2 = roomRepository
				.saveAndFlush(RoomEntity.builder().id(2).name("Best Room 2").fromDate(LocalDate.of(2018, 10, 8))
						.toDate(LocalDate.of(2018, 10, 26)).adultsCount(5).hotel(hotel1).build());

		RoomEntity room3 = roomRepository
				.saveAndFlush(RoomEntity.builder().id(3).name("Best Room 3").fromDate(LocalDate.of(2018, 10, 12))
						.toDate(LocalDate.of(2018, 10, 16)).adultsCount(7).hotel(hotel2).build());

		RoomEntity room4 = roomRepository
				.saveAndFlush(RoomEntity.builder().id(4).name("Best Room 4").fromDate(LocalDate.of(2018, 10, 18))
						.toDate(LocalDate.of(2018, 10, 20)).adultsCount(3).hotel(hotel3).build());

		RoomEntity room5 = roomRepository
				.saveAndFlush(RoomEntity.builder().id(5).name("Best Room 5").fromDate(LocalDate.of(2018, 10, 22))
						.toDate(LocalDate.of(2018, 10, 25)).adultsCount(7).hotel(hotel4).build());

		RoomEntity room6 = roomRepository
				.saveAndFlush(RoomEntity.builder().id(6).name("Best Room 6").fromDate(LocalDate.of(2018, 10, 18))
						.toDate(LocalDate.of(2018, 10, 26)).adultsCount(7).hotel(hotel4).build());

		RoomEntity room7 = roomRepository
				.saveAndFlush(RoomEntity.builder().id(6).name("Best Room 7").fromDate(LocalDate.of(2018, 10, 22))
						.toDate(LocalDate.of(2018, 10, 30)).adultsCount(7).hotel(hotel4).build());

		// Amenities
		amenityRepository.saveAndFlush(AmenityEntity.builder().id(1).name("Best - Free Coffee").room(room1).build());
		amenityRepository.saveAndFlush(AmenityEntity.builder().id(2).name("Best - Spa").room(room2).build());
		amenityRepository.saveAndFlush(AmenityEntity.builder().id(3).name("Best - Fishing").room(room3).build());
	}
}
