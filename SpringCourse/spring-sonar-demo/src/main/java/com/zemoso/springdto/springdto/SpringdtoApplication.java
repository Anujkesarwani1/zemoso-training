package com.zemoso.springdto.springdto;

import com.zemoso.springdto.springdto.model.Location;
import com.zemoso.springdto.springdto.model.User;
import com.zemoso.springdto.springdto.respository.LocationRepository;
import com.zemoso.springdto.springdto.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringdtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringdtoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Pune");
		location.setDescription("Pune is great place to live");
		location.setLongitude(48.5);
		location.setLatitude(30.6);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Anuj");
		user1.setLastName("Kesarwani");
		user1.setEmail("anuj@gmail.com");
		user1.setPassword("password");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Avi");
		user2.setLastName("Srivastava");
		user2.setEmail("avi@gmail.com");
		user2.setPassword("password2");
		user2.setLocation(location);
		userRepository.save(user2);

	}
}
