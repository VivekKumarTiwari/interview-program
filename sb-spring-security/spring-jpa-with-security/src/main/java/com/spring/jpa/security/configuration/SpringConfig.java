package com.spring.jpa.security.configuration;


import com.spring.jpa.security.service.impl.SBUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringConfig {


    @Autowired
    private SBUserService sbUserService;



    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

      return  http.authorizeHttpRequests(req->
                req.requestMatchers("/home","/item").authenticated()
                        .requestMatchers("/registration","/user-login").permitAll()
        ).userDetailsService(sbUserService).httpBasic(hbc->hbc.disable())
              .formLogin(flb->flb.loginProcessingUrl("/login"))
              .build();
    }

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
}
