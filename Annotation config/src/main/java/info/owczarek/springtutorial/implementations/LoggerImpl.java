package info.owczarek.springtutorial.implementations;

import java.util.Date;

import org.springframework.stereotype.Service;

import info.owczarek.springtutorial.api.Logger;

@Service
public class LoggerImpl implements Logger {

	public void log(String message) {

		System.out.println(new Date() + ": " + message);
	}

}
