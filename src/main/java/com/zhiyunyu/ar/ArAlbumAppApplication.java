package com.zhiyunyu.ar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  // 添加了一个注解
public class ArAlbumAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArAlbumAppApplication.class, args);
	}
	//添加了一个方法
	@RequestMapping("/hello")
	public String hello(){
		return "hello world";
	}
}
