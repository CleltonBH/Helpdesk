package com.clelton.Helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clelton.Helpdesk.models.Role;

@Repository
public interface RolesRepository extends JpaRepository<Role, Long> {

}
