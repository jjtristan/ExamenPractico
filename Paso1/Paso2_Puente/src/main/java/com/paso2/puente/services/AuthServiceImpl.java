package com.paso2.puente.services;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.paso2.puente.models.dtos.LoginDto;
import com.paso2.puente.security.JwtTokenProvider;

@Service
public class AuthServiceImpl implements IAuthService {
	
	private AuthenticationManager authenticationManager;

    @Override
    public String login(LoginDto loginDto) {

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getNombreUsuarioOEmail(),
                loginDto.getPassword()
        ));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = JwtTokenProvider.generateToken(authentication);

        return token;
    }
}
