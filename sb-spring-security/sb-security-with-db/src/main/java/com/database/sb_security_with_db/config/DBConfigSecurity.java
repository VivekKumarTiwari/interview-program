package com.database.sb_security_with_db.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class DBConfigSecurity {




    @Bean
    public SecurityFilterChain defaultSecurityFilter(HttpSecurity http) throws Exception {

       return http.authorizeHttpRequests(req->
                req.requestMatchers("/home","/item").authenticated()
                        .requestMatchers("/login-user").permitAll())
                .httpBasic(hbc->hbc.disable())
                .formLogin(flg->flg.loginProcessingUrl("/login")).build();
    }



    @Bean
  public JdbcUserDetailsManager creatseSourc(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
  }



  @Bean
  public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
  }
}
