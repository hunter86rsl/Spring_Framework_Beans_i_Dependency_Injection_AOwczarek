package info.owczarek.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.owczarek.springtutorial.api.UserRepository;
import info.owczarek.springtutorial.domain.User;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"konfiguracja.xml");
		
		UserRepository usersRepository = context.getBean(
				"repozytoriumUzytkownikow", UserRepository.class);

		User janek = usersRepository.createUser("janek");
		
	}

 
}
