/**
 * 
 */
package com.cg.springsecuritypractice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cg.springsecuritypractice.dto.User;
import com.cg.springsecuritypractice.dto.UserDetailsImpl;
import com.cg.springsecuritypractice.repository.UserRepository;

/**
 * @author DEVANG
 *
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUsername(username);
		user.orElseThrow(()->new UsernameNotFoundException("User not found: "+username));
		return user.map(UserDetailsImpl::new).get();
	}

}
