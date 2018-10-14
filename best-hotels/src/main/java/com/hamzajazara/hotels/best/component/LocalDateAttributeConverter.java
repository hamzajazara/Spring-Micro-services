package com.hamzajazara.hotels.best.component;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;

/**
 * 
 * @author Hamza Aljazara
 *
 */
public class LocalDateAttributeConverter implements AttributeConverter<LocalDate, Date> {

	/*
	 * @see javax.persistence.AttributeConverter#convertToDatabaseColumn(java.lang.
	 * Object)
	 */
	@Override
	public Date convertToDatabaseColumn(LocalDate locDate) {
		return (locDate == null ? null : Date.valueOf(locDate));
	}

	/*
	 * @see javax.persistence.AttributeConverter#convertToEntityAttribute(java.lang.
	 * Object)
	 */
	@Override
	public LocalDate convertToEntityAttribute(Date sqlDate) {
		return (sqlDate == null ? null : sqlDate.toLocalDate());
	}
}
