package com.hamzajazara.hotels.best.config;

import java.io.IOException;

import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 
 * @author Hamza Aljazara
 *
 */
@Configuration
public class SwaggerConfig {

	/**
	 * 
	 * @return
	 * @throws IOException
	 * @throws XmlPullParserException
	 */
	@Bean
	public Docket api() throws IOException, XmlPullParserException {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.hamzajazara.hotels.best.controller"))
				.paths(PathSelectors.any()).build();
	}
}
