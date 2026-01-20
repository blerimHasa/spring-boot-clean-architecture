package com.blerimhasa.cleanarch.auth;

public record AuthResponse(
        String token,
        String email,
        String name
) {
}
