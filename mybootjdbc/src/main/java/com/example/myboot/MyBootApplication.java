package com.example.myboot;

import com.example.myboot.model.Article;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.example.myboot.mapper")
@EnableAutoConfiguration
@ComponentScan(value = "com.example.myboot.*")
public class MyBootApplication   implements CommandLineRunner{
	private static Long times;
	@Autowired
	private Article article;
	public static void main(String[] args) {
		times=System.currentTimeMillis();
		SpringApplication.run(MyBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		times=System.currentTimeMillis()-times;
		System.out.println("启动时间{}"+times);
		System.out.println("启动时间{}"+times);
		System.out.println(article.getTitile());
		System.out.println("application  is running");
	}
}

