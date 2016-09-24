package com.arpit.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.io.ClassPathResource;

@Configuration
@PropertySources({
		@PropertySource("classpath:properties/app.properties"),
		@PropertySource("classpath:properties/app-${spring.profiles.active}.properties") })
@ComponentScan(basePackages = "com.arpit.controller")
public class ApplicationConfig {

	@Bean(name = "keys")
	public static PropertiesFactoryBean keys() {
		PropertiesFactoryBean bean = new PropertiesFactoryBean();
		bean.setLocation(new ClassPathResource("key.properties"));
		return bean;
	}
}
