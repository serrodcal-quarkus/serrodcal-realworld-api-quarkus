package dev.serrodcal.application.web.model.response;

public record UserResponse(
    String username,
    String bio,
    String image,
    String email,
    String token
) { }
