package info.owczarek.springtutorial.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.domain.User;

@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
	@Autowired(required = false)
	private Logger logger;

	// @Value("mojKomputer")
	@Value("${database.host}")
	private String host;
	// @Value("111")
	@Value("${database.port}")
	private int port;
	// @Value("mojaBaza")
	@Value("${database.name}")
	private String database;
	@Value("#{systemProperties['database.user']}")
	private String user;
	@Value("#{systemProperties['database.password']}")
	private String password;

	public User createUser(String name) {
		if (logger != null) {
			logger.log("Dodawanie u¿ytkownika " + name + " do bazy " + host + ":" + port + "/" + database
					+ " korzystajac z uzytkownika " + user + " i hasla " + password);
		}
		return new User(name);
	}

	public void setLogger(Logger logger) {

		this.logger = logger;
	}

}
