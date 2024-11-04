package com.smartdeltasystems.service.serviceimpl;

import com.smartdeltasystems.dataaccess.dto.TokenDto;
import com.smartdeltasystems.service.serviceapi.TokenService;
import lombok.AllArgsConstructor;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TokenServiceImpl implements TokenService {

    private final OAuth2AuthorizedClientService authorizedClientService;

    @Override
    public TokenDto getTokenDto(OAuth2User principal) {
        OAuth2AuthorizedClient authorizedClient = authorizedClientService.loadAuthorizedClient(
                "google", principal.getName());
        if (authorizedClient == null) {
            authorizedClient = authorizedClientService.loadAuthorizedClient("github",
                    principal.getName());
        }
        if (authorizedClient != null) {
            OAuth2AccessToken accessToken = authorizedClient.getAccessToken();
            return TokenDto.builder().accessToken(accessToken.getTokenValue()).build();
        }
        return null;
    }
}
