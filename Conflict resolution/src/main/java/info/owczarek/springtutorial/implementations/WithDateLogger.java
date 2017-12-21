package info.owczarek.springtutorial.implementations;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import info.owczarek.springtutorial.api.Logger;

@Service
@Qualifier("withDateLoggerAnnotationQualifier")
public class WithDateLogger implements Logger {

	public void log(String message) {

		System.out.println(new Date() + ": " + message);
	}

}
