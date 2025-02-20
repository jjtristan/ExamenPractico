/**
 * 
 */
package com.paso2.puente.security.services;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.paso2.puente.dao.UserRepository;
import com.paso2.puente.models.entities.Usuario;

/**
 * 
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	private UserRepository userRepository;

	/**
	 * 
	 */
	public CustomUserDetailsService() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userRepository
	 */
	public CustomUserDetailsService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {

        Usuario user = userRepository.findBynombreUsuarioOrCorreo(usernameOrEmail, usernameOrEmail)
                .orElseThrow(() -> new UsernameNotFoundException("User not exists by Username or Email"));

        Set<GrantedAuthority> authorities = user.getRoles().stream()
                .map((role) -> new SimpleGrantedAuthority(role.getNombre()))
                .collect(Collectors.toSet());

        return new org.springframework.security.core.userdetails.User(
                usernameOrEmail,
                user.getPassword(),
                authorities
        );
    }

}
