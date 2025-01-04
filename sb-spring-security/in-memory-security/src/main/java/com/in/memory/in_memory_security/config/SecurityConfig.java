package com.in.memory.in_memory_security.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {



    @Bean
    public SecurityFilterChain defaultSecurity(HttpSecurity http) throws Exception {

     return   http.authorizeHttpRequests((req)->
                req.requestMatchers("/login-user").permitAll()
                        .requestMatchers("/item","/home").authenticated()
                ).formLogin(flc-> flc.loginProcessingUrl("/login"))
                .httpBasic(hbc->hbc.disable())
                .build();
    }




    @Bean
    protected InMemoryUserDetailsManager config() throws Exception {
        UserDetails user= User.withUsername("user").password("{noop}root").build();
        UserDetails user2=User.withUsername("user2").password("{noop}admin").build();

      return new InMemoryUserDetailsManager(user2,user);
    }
}
