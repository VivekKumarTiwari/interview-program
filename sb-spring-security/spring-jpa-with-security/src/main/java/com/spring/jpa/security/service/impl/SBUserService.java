package com.spring.jpa.security.service.impl;


import com.spring.jpa.security.entity.UserEntity;
import com.spring.jpa.security.repository.SBUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SBUserService implements UserDetailsService {


    public SBUserService(SBUserRepository sbUserRepository) {
        this.sbUserRepository = sbUserRepository;
    }

/*    @Autowired*/
    private SBUserRepository sbUserRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = sbUserRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return new CustomUserDetails(user);
    }
}
