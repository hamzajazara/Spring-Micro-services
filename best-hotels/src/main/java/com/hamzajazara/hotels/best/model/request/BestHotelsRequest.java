package com.hamzajazara.hotels.best.model.request;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

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
@ApiModel("Best Hotels Request")
@Setter
@Getter
public class BestHotelsRequest {

	@ApiModelProperty("City")
	@NotEmpty(message = "City can't be empty")
	private String city;

	@ApiModelProperty(name = "From Date", example = "2018-10-13")
	@NotNull(message = "From Date can't be null")
	private LocalDate fromDate;

	@ApiModelProperty(name = "To Date", example = "2018-11-13")
	@NotNull(message = "To Date can't be null")
	private LocalDate toDate;

	@ApiModelProperty("Adults Count")
	@PositiveOrZero
	private int numOfAdults;
}
