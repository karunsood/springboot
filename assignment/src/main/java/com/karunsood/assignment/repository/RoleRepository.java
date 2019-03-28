package com.karunsood.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karunsood.assignment.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
