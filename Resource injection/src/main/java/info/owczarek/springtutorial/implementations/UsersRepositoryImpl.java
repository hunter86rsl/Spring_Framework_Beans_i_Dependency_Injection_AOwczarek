package info.owczarek.springtutorial.implementations;

import org.springframework.stereotype.Service;

import info.owczarek.springtutorial.api.Logger;
import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.domain.User;
import javax.annotation.*;

@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {

	@Resource//(name = "counterLogger")
	private Logger counterLogger;

	public User createUser(String name) {
		counterLogger.log("Tworzenie u¿ytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {

		this.counterLogger = logger;
	}

}
