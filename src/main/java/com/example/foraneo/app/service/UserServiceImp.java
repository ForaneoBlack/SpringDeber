package com.example.foraneo.app.service;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.foraneo.app.entity.User;
import com.example.foraneo.app.repository.UserRepository;

@Service

public class UserServiceImp implements UserService{

	@Autowired
	private UserRepository  userR;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<User> findAll() {
		
		return userR.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<User> findAll(Pageable pageable) {
		
		return userR.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<User> findById(Long id) {
		
		return userR.findById(id);
	}

	@Override
	@Transactional
	public User save(User user) {
		
		return userR.save(user );
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		userR.deleteById(id);
		
	}

}
