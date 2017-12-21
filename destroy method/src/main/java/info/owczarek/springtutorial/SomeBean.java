package info.owczarek.springtutorial;

import org.springframework.beans.factory.DisposableBean;

public class SomeBean implements DisposableBean{
	public void destroyMethod() {
		System.out.println("Niszczenie beana!");
	}
	
	public void isWorking() {
		System.out.println("Dzia³a!");
	}

	public void destroy() throws Exception {
		System.out.println("Niszczenie przez disponsable bean!");
	}
}
