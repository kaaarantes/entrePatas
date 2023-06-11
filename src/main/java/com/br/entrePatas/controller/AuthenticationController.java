package com.br.entrePatas.controller;

/*
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.br.entrePatas.controller.authentication.AuthenticationRequest;
import com.br.entrePatas.controller.authentication.AuthenticationRespose;
import com.br.entrePatas.controller.authentication.AuthenticationService;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class AuthenticationController {

    AuthenticationService authenticationService;

    @PostMapping
    public ResponseEntity<AuthenticationRespose> login(@RequestBody AuthenticationRequest request) {
        AuthenticationRespose response = authenticationService.login(request);
        return ResponseEntity.ok()
                .header("Authentication", response.getTokenJwt())
                .body(response);
    }
}*/