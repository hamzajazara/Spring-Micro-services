package com.hamzajazara.gateway.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

/**
 * 
 * @author Hamza Aljazara
 *
 */
@Component
@Primary
@EnableAutoConfiguration
public class SwaggerProvider implements SwaggerResourcesProvider {

	/*
	 * @see com.google.common.base.Supplier#get()
	 */
	@Override
	public List<SwaggerResource> get() {
		List<SwaggerResource> resources = new ArrayList<>();
		resources.add(swaggerResource("Available Hotels", "/api/available-hotels/v2/api-docs", "2.0"));
		resources.add(swaggerResource("Best Hotels", "/api/best-hotels/v2/api-docs", "2.0"));
		resources.add(swaggerResource("Crazy Hotels", "/api/crazy-hotels/v2/api-docs", "2.0"));
		return resources;
	}

	/**
	 * 
	 * @param name
	 * @param location
	 * @param version
	 * @return
	 */
	private SwaggerResource swaggerResource(String name, String location, String version) {
		SwaggerResource swaggerResource = new SwaggerResource();
		swaggerResource.setName(name);
		swaggerResource.setLocation(location);
		swaggerResource.setSwaggerVersion(version);
		return swaggerResource;
	}
}
