package com.ryz2593;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ryz2593
 */
@SpringBootApplication
@MapperScan("com.ryz2593.mapper")
public class BootMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMapperApplication.class, args);
	}

}
