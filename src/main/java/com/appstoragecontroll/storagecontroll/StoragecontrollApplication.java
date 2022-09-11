package com.appstoragecontroll.storagecontroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class StoragecontrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoragecontrollApplication.class, args);
	}

}
