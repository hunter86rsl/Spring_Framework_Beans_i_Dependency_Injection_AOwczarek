package info.owczarek.springtutorial.api;

import info.owczarek.springtutorial.domain.User;

public interface UserRepository {
	User createUser(String name);

}
