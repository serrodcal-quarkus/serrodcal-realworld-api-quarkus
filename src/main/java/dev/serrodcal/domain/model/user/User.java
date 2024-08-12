package dev.serrodcal.domain.model.user;

import java.util.UUID;

public record User(
    UUID id,
    String username,
    String email,
    String salt,
    String hash,
    String bio,
    String image
) { }
