package com.example.demo;

import com.example.demo.model.Tasks;
import com.example.demo.model.cUser;
import com.example.demo.repository.TasksRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.config.Task;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserRepository userRepository, TasksRepository tasksRepository) {
		return args -> {

			cUser c = new cUser();
			c.setUserName("Mari");
			userRepository.save(c);


			Tasks t = new Tasks();
			t.setCompleted(false);
			t.setTaskName("Flowers");
			t.setDateString("2013-12-13");
			t.setTaskDescription("Water the flowers");
			tasksRepository.save(t);





	};

	}
}