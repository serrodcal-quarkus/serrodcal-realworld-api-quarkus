package dev.serrodcal.domain.model.article;

import dev.serrodcal.domain.model.user.User;

import java.time.LocalDateTime;
import java.util.UUID;

public record Article(
    UUID id,
    String slug,
    String title,
    String description,
    String body,
    LocalDateTime createdAt,
    LocalDateTime updatedAt,
    User author
) { }
