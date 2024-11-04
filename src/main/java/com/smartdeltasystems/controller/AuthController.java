package com.smartdeltasystems.controller;

import com.smartdeltasystems.common.Urls;
import com.smartdeltasystems.dataaccess.dto.TokenDto;
import com.smartdeltasystems.service.serviceapi.TokenService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Tag(name = "Auth", description = "Методы для взаимодействия c данными текущего пользователя")
public class AuthController {

    private final TokenService tokenService;

    @Operation(summary = "Метод для получения токена текущего пользователя")
    @GetMapping(Urls.Token.FULL)
    public ResponseEntity<?> getToken(@AuthenticationPrincipal OAuth2User principal) {
        TokenDto tokenDto = tokenService.getTokenDto(principal);
        if (tokenDto != null) {
            return ResponseEntity.ok().body(tokenDto);
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }
}