package info.owczarek.springtutorial;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UserRepository;
import info.owczarek.springtutorial.domain.User;
import info.owczarek.springtutorial.implementations.LoggerImpl;
import info.owczarek.springtutorial.implementations.UserRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UserRepository usersRepository = new UserRepositoryImpl();
		usersRepository.setLogger(logger);
		
		User user = usersRepository.createUser("janek");
	}
}
