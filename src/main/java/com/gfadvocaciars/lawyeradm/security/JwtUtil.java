package com.gfadvocaciars.lawyeradm.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Date;

@Component
public class JwtUtil {

    private String secret = "secret";

    private Long expiration = 600L;

    public String generateToken(String username){

    return JWT
            .create()
            .withIssuedAt(new Date())
            .withClaim("userId", username)
                .sign(algorithm());
}

    private Algorithm algorithm() {
        try {
            return Algorithm.HMAC256(secret);
        } catch (UnsupportedEncodingException cause) {
            throw new RuntimeException("Could not sign request", cause);
        }
    }
}
