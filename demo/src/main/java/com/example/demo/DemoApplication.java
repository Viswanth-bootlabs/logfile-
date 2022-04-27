package com.example.demo;

import lombok.extern.log4j.Log4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		log.info("***************************************************************************");
		for (int i=0;i<=100;i++){
			System.out.println("hi");
			if(i==100){
				System.out.println(i);
				log.error("it is an error message");
			}
		}
	}

}
