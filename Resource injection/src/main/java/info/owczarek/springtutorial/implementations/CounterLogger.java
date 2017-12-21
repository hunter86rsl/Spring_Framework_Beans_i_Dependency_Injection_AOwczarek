package info.owczarek.springtutorial.implementations;

import org.springframework.stereotype.Service;

import info.owczarek.springtutorial.api.Logger;

@Service("counterLogger")
public class CounterLogger implements Logger {
	private int counter = 0;

	public void log(String message) {
		System.out.println(counter++ + ": " + message);
	}

}
