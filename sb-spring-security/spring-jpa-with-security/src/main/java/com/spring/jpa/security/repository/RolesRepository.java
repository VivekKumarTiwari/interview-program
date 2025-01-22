package com.spring.jpa.security.repository;

import com.spring.jpa.security.entity.SB_Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolesRepository extends JpaRepository<SB_Roles,Long> {
}
