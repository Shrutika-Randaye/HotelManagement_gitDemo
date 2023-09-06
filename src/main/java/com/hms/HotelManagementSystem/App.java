package com.hms.HotelManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
		System.out.println("Welcome you All...............");
    }
}
