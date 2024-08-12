package dev.serrodcal.application.web.model.request;

public record NewUserRequest(
    String username,
    String email,
    String password
) { }
