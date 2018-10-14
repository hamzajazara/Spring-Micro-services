package com.hamzajazara.hotels.best.service.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hamzajazara.hotels.best.entity.HotelEntity;
import com.hamzajazara.hotels.best.entity.RoomEntity;
import com.hamzajazara.hotels.best.model.request.BestHotelsRequest;
import com.hamzajazara.hotels.best.repository.HotelRepository;

/**
 * 
 * @author haljazara
 *
 */
@RunWith(SpringRunner.class)
public class HotelServiceImplTest {

	@InjectMocks
	HotelServiceImpl hotelServiceImpl;

	@MockBean
	HotelRepository hotelRepository;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSearchHotels() {
		// Assert
		BestHotelsRequest hotelsRequest = new BestHotelsRequest();
		hotelsRequest.setNumOfAdults(5);
		hotelsRequest.setCity("Faro");
		hotelsRequest.setFromDate(LocalDate.now());
		hotelsRequest.setToDate(LocalDate.now().plusDays(10));

		// Arrange
		List<RoomEntity> rooms = Arrays.asList(RoomEntity.builder().adultsCount(5).fromDate(LocalDate.now())
				.toDate(LocalDate.now().plusDays(10)).build());
		List<HotelEntity> hotels = Arrays.asList(HotelEntity.builder().city("Faro").rooms(rooms).build());
		when(hotelRepository.getBesthotels(hotelsRequest)).thenReturn(hotels);

		// Act
		assertEquals(hotels, hotelServiceImpl.searchHotels(hotelsRequest));
	}

}
