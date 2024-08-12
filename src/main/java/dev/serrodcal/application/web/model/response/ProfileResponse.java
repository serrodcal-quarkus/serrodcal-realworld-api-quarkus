package dev.serrodcal.application.web.model.response;

public record ProfileResponse(
    String username,
    String bio,
    String image,
    boolean following
) { }
