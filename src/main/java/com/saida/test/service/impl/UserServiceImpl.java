package com.saida.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saida.test.repository.User;
import com.saida.test.repository.UserRepository;
import com.saida.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository<User> userRepository;

	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	public List<User> findByName(String name) {
		return userRepository.findByFirstName(name);
	}

	public Optional<User> getById(Long id) {
		return userRepository.findById(id);
	}

	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}

	public boolean addUser(User User) {
		return userRepository.save(User) != null;
	}

	public boolean updateUser(User User) {
		return userRepository.save(User) != null;
	}

}
