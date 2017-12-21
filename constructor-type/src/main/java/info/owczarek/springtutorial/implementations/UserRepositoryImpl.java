package info.owczarek.springtutorial.implementations;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UserRepository;
import info.owczarek.springtutorial.domain.User;

public class UserRepositoryImpl implements UserRepository, USER_EXCEPTION {
	private Logger logger;

	public UserRepositoryImpl(Logger logger, String localization, String dbName) {
		this.logger = logger;
		logger.log("Lokalizacja repozytorium: " + localization + "/" + dbName);
	}

	public User createUser(String name) {
		logger.log("Tworzenie uzytkownika " + name);
		return new User(name);
	}

}
