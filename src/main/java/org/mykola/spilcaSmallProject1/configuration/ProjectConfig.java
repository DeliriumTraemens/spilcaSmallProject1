package org.mykola.spilcaSmallProject1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfig {

//    1 UserDetails wired by associated *Service
//    В данном кейсе возвращает бин InMemoryUserDetailsService с ЗАРЯЖЕННЫМИ ЮЗЕРАМИ
//    По сути это локальная ДБ в памяти
    @Bean
    public UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//      Define Users by UserDetails User
        var user1 = User.withUsername("john")
                .password("12345")
                .authorities("READ")
                .build();
        var user2 = User.withUsername("jane")
                .password("12345")
                .authorities("WRITE")
                .build();
//      defined Users loaded into manager -- wired to Context
        manager.createUser(user1);
        manager.createUser(user2);

        return manager;
    }
//  2 PasswordEncoder wired
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
