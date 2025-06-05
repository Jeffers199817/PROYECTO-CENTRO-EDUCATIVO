package com.centroeducativo.centroeducativo;

import org.springframework.boot.SpringApplication;

public class TestCentroeducativoApplication {

	public static void main(String[] args) {
		SpringApplication.from(CentroeducativoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
