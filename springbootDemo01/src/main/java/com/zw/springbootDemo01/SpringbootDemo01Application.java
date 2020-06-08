package com.zw.springbootDemo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zw.springbootDemo01.mapper")
public class SpringbootDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo01Application.class, args);
	}

}
