package com.shopme.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//@SpringBootApplication=@Configuration, @EnableAutoConfiguration and @ComponentScan

//How to exclude a class
//@ComponentScan(excludeFilters  = {@ComponentScan.Filter(
//type = FilterType.ASSIGNABLE_TYPE, classes = {WorkerConfig.class, WorkerExecutors.class, Worker.class})})

@SpringBootApplication
@EntityScan({ "com.shopme.common.entity" })
public class ShopmeBackEndApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShopmeBackEndApplication.class, args);
	}
}