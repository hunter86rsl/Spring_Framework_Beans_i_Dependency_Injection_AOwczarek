package info.owczarek.springtutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.implementations.DateLogger;
import info.owczarek.springtutorial.implementations.UsersRepositoryImpl;

@Configuration
public class AppConfiguration {
	@Bean
	public Logger logger() {
		return new DateLogger();
	}
	
	@Bean
	public UsersRepository usersRepository() {
		UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger());
		return usersRepository;
	}
}
