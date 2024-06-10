package com.jadnobarbosa.ramengo.auth;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private static final String AUTH_KEY_HEADER_NAME = "x-api-key";
    private static final String AUTH_KEY = "giCqJ0wICJ4pVuXfUixGshmuuhmFJNr2iVJDOO6SalwiidpAwutMptwjWxbTMll3";

    public static Authentication validateKey(HttpServletRequest request) {
        String key = request.getHeader(AUTH_KEY_HEADER_NAME);
        if(key == null) {
            throw new BadCredentialsException("x-api-key header missing");
        }
        if(!key.equals(AUTH_KEY)) {
            throw new BadCredentialsException("invalid x-api-key header");
        }

        return new ApiKeyAuthentication(key, AuthorityUtils.NO_AUTHORITIES);
    }

}
