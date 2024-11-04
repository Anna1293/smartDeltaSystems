package com.smartdeltasystems.service.serviceapi;

import com.smartdeltasystems.dataaccess.dto.TokenDto;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;

public interface TokenService {

    TokenDto getTokenDto(@AuthenticationPrincipal OAuth2User principal);
}
