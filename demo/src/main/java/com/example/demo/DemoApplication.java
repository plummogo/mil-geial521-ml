package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(MapObjectRepository repository) {
		List<Cage> cages = new ArrayList<>();
		List<Buoy> buoys = new ArrayList<>();

		buoys.add(new Buoy(5, "B1", new ComponentType(1, "buoy")));
		buoys.add(new Buoy(6, "B2", new ComponentType(1, "buoy")));
		buoys.add(new Buoy(7, "B3", new ComponentType(1, "buoy")));
		buoys.add(new Buoy(8, "B4", new ComponentType(1, "buoy")));

		cages.add(new Cage(4, "C1", new ComponentType(2, "cage"), new Ring(1, "2023v4", new ComponentType(3, "ring"), 0.2, 4)));
		cages.add(new Cage(5, "C2", new ComponentType(2, "cage"), new Ring(2, "2023v5", new ComponentType(3, "ring"), 0.223, 5)));
		cages.add(new Cage(6, "C3", new ComponentType(2, "cage"), new Ring(3, "2023v6", new ComponentType(3, "ring"), 0.2432, 6)));

		return args -> {
			MapObject mapObject = new MapObject(
					3,
					"2023.v1.map-object_ddm",
					new Coordinates(
							1,
							12.12312,
							23.23423,
							"DDM"
					),
					cages,
					buoys
			);
			//repository.insert(mapObject);
		};
	}
}
