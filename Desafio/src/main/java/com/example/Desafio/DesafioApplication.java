package com.example.Desafio;

import com.example.Desafio.entities.User;
import com.example.Desafio.repositories.UserRepository;
import com.example.Desafio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@EntityScan
@SpringBootApplication
public class DesafioApplication {
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
				User user = new User();
				user.setName(name);
				user.setEmail(name+"@mail.com");
				user.setUsername("User "+name);
				user.setSurname(name + " " + name);
				user.setIsEnable(true);
				user.setPassword(name + "123");
				user.setPhone("31912345678");
				user.setRegisterDate(new Date());

				userRepository.save(user);
			});
		};
	}

}
