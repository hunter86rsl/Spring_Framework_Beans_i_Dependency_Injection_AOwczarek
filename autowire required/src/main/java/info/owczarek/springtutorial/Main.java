package info.owczarek.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.owczarek.springtutorial.api.UsersRepository;
import info.owczarek.springtutorial.domain.User;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
		
		UsersRepository usersRepository = context.getBean("usersRepository", UsersRepository.class);
		User janek = usersRepository.createUser("janek");
		
		System.out.println("U¿ytkownik " + janek.getName() + " zosta³ utworzony");
	}

}
