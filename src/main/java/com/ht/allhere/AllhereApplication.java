package com.ht.allhere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.ht.allhere.dao")
public class AllhereApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllhereApplication.class, args);
	}

}
