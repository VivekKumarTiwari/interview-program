package com.security.sb_secruity.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigSB {




    @Bean
    SecurityFilterChain defaultSpringSecFilterChain(HttpSecurity http) throws Exception {

      return  http.authorizeHttpRequests((req)->
                req.requestMatchers("/home","/item").authenticated()
                        .requestMatchers("/login-user").permitAll())
              .httpBasic(hbc->hbc.disable())
             .formLogin(flc->flc.loginProcessingUrl("/login"))
              .build();
    }
}
