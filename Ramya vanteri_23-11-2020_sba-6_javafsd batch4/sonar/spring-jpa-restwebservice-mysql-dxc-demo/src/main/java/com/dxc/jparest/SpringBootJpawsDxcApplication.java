package com.dxc.jparest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dxc.jparest.dao.MovieDAO;
import com.dxc.jparest.entity.Movie;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootJpawsDxcApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpawsDxcApplication.class, args);
	}

	

}
 