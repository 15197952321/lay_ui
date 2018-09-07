package com.liguo.my_layui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@MapperScan("com.liguo.my_layui.mapper")
public class MyLayuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyLayuiApplication.class, args);
	}
}
