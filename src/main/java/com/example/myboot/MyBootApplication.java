package com.example.myboot;

import com.example.myboot.model.Article;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@MapperScan(value = "com.example.myboot.mapper")
//@EnableAutoConfiguration
//@ComponentScan(value = "com.example.myboot.*")
public class MyBootApplication implements CommandLineRunner{
	@Autowired
	private Article article;
	public static void main(String[] args) {
		SpringApplication.run(MyBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(article.getTitile());
		System.out.println("application  is running");
	}
}

