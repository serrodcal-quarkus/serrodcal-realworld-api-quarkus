package dev.serrodcal.domain.model.comment;

import dev.serrodcal.domain.model.article.Article;
import dev.serrodcal.domain.model.user.User;

import java.time.LocalDateTime;
import java.util.UUID;

public record Comment(
    UUID id,
    User author,
    Article article,
    String body,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) { }
