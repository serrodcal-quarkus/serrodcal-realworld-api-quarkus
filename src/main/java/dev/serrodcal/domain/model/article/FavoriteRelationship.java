package dev.serrodcal.domain.model.article;

import dev.serrodcal.domain.model.user.User;

public record FavoriteRelationship(
        User user,
        Article article
) { }
