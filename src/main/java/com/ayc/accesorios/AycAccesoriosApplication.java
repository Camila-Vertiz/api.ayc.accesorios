package com.ayc.accesorios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication(scanBasePackages = { "com.ayc.accesorios" })
public class AycAccesoriosApplication extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer
{
    public static void main( String[] args )
    {
    	SpringApplication.run(AycAccesoriosApplication.class, args);
    }
    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AycAccesoriosApplication.class);
	}	
    
    @Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
}
