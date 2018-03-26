package com.dunght.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dunght.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRoleName(String roleName);
}
