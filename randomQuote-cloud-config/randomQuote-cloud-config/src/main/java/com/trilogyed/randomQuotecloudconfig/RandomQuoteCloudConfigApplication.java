package com.trilogyed.randomQuotecloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class RandomQuoteCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomQuoteCloudConfigApplication.class, args);
	}

}
