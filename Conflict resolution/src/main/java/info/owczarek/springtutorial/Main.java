package info.owczarek.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.owczarek.springtutorial.api.UsersRepository;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:konfiguracja.xml");
		
		UsersRepository usersRepository = context.getBean("usersRepository", UsersRepository.class);
		usersRepository.createUser("janek");
	}

}
