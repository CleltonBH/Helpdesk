package com.clelton.Helpdesk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clelton.Helpdesk.models.Role;
import com.clelton.Helpdesk.repositories.RolesRepository;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RolesRepository repository;
	
	public RoleServiceImpl(RolesRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Role> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Role create(Role role) {
		role.setName(role.getName().toUpperCase());
		Role roleCreated = this.repository.save(role);
		return roleCreated;
	}

	@Override
	public Boolean delete(Long id) {
		Role role = findById(id);
		if(role != null) {
			this.repository.deleteById(id);
			return true;
		}
		
		return false;
		
	}
	
	@SuppressWarnings("deprecation")
	private Role findById(Long id) {
		return this.repository.getById(id);
	}

}
