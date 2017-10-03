package com.example.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.repository.UserRepository;

@Service
public class LoginUserDetailsService implements UserDetailsService {
	private final UserRepository userRepository;

	public LoginUserDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return userRepository.findById(username).map(LoginUserDetails::new).orElseThrow(
				() -> new UsernameNotFoundException("The requested user is not found."));
	}
}