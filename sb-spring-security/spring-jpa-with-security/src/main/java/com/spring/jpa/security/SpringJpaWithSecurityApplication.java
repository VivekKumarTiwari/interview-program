package com.spring.jpa.security;

import com.spring.jpa.security.entity.SB_Roles;
import com.spring.jpa.security.entity.UserEntity;
import com.spring.jpa.security.repository.RolesRepository;
import com.spring.jpa.security.repository.SBUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableWebSecurity
public class SpringJpaWithSecurityApplication implements CommandLineRunner {


	@Autowired
	 SBUserRepository sbUserRepository;


	@Autowired
	 RolesRepository rolesRepository;


	@Autowired
	 PasswordEncoder encoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaWithSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		SB_Roles roles=new SB_Roles();
		roles.setRoleName("ADMIN");

		rolesRepository.save(roles);
		Set<SB_Roles> sbRolesSet=new HashSet<>();
		sbRolesSet.add(roles);

		UserEntity userEntity=new UserEntity();
		userEntity.setEnabled(true);
		userEntity.setPassword(encoder.encode("admin123"));
		userEntity.setUsername("admin");
		userEntity.setRoles(sbRolesSet);

		sbUserRepository.save(userEntity);

	}
}
