package org.mykola.spilcaSmallProject1.service;

import org.mykola.spilcaSmallProject1.entity.User;
import org.mykola.spilcaSmallProject1.model.CustomUserDetails;
import org.mykola.spilcaSmallProject1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;
@Service
public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


//AHTUNG -- using CustomUserDetails with User wrapped inside instead of UserDetails
    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Supplier<UsernameNotFoundException>s=
                ()-> new UsernameNotFoundException("Username not found");
        User u = userRepository.findUserByUsername(username)
                .orElseThrow(s);
        return new CustomUserDetails(u);
    }
}
