package StudentProject.service;

import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import StudentProject.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User saveUser(UserRequest userRequest) {
		User user = User.build(user:0,)
		return repository.save(null)
	}

}
