package com.br.entrePatas.controller.authentication;
/*
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.br.entrePatas.model.Pessoa;
import com.br.entrePatas.repository.PessoaRepository;
import com.br.entrePatas.security.JWTUtil;
import com.br.entrePatas.security.UserSS;

import lombok.RequiredArgsConstructor;

@Service
public class AuthenticationService {

    PessoaRepository pessoaRepository ;
    JWTUtil jwtService;
    AuthenticationManager authenticationManager;

    public AuthenticationRespose login(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getSenha()

                )
        );
        Pessoa user = pessoaRepository.findByEmail(request.getEmail())
                .orElseThrow();

        UserSS userSS = new UserSS(user.getIdPessoa(), user.getEmail(), user.getSenha());
        String jwtToken = jwtService.generateToken(userSS);

        return new AuthenticationRespose(jwtToken);
    }
}*/
