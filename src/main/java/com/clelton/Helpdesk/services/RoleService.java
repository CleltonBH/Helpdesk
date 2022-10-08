package com.clelton.Helpdesk.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.clelton.Helpdesk.models.Role;

@Service
public interface RoleService {
	public List<Role> findAll();
	public Role create(Role role);
	public Boolean delete(Long id);
}
