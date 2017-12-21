package info.owczarek.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.owczarek.springtutorial.api.UserRepository;
import info.owczarek.springtutorial.domain.User;
import info.owczarek.springtutorial.implementations.SomeBean;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		
		SomeBean bean = context.getBean("someBean", SomeBean.class);
	}
 
}
