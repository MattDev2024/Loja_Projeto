package com.MattCorp.CRUD.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MattCorp.CRUD.entities.User;
import com.MattCorp.CRUD.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> buscaTudo(){
		return userRepository.findAll();
	}
	
	public User buscaPorId(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get(); /* retorna o valor que a variavel optional recebe */
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = userRepository.getReferenceById(id);
		/* estancia um objeto mas não vai no banco de dados ainda */
		updateData(entity,obj);
		return userRepository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	
	
	
}
