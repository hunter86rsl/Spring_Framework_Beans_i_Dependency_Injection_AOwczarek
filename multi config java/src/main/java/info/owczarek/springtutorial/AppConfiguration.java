package info.owczarek.springtutorial;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({LoggersConfiguration.class, RepositoriesConfiguration.class})

public class AppConfiguration {
}

