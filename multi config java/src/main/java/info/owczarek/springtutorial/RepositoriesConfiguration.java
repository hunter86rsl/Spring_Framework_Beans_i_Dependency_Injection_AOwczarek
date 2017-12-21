package info.owczarek.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.implementations.UsersRepositoryImpl;

@Configuration
public class RepositoriesConfiguration {
	@Autowired
	private Logger logger;
	
	@Autowired
	private LoggersConfiguration loggersConfiguration;
	
	@Bean
	public UsersRepository usersRepository() {
		UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
//		usersRepository.setLogger(logger);
		usersRepository.setLogger(loggersConfiguration.logger());
		return usersRepository;
	}

}
