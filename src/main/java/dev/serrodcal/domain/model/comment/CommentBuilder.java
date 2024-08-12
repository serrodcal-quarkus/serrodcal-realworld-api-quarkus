package dev.serrodcal.domain.model.comment;

import dev.serrodcal.domain.model.article.Article;
import dev.serrodcal.domain.model.user.User;
import dev.serrodcal.domain.model.validator.ModelValidator;

import java.time.LocalDateTime;
import java.util.UUID;

public class CommentBuilder {

    private final ModelValidator modelValidator;

    public CommentBuilder(ModelValidator modelValidator) {
        this.modelValidator = modelValidator;
    }

    public Comment build(User author, Article article, String body) {
        final var createdAt = LocalDateTime.now();
        return modelValidator.validate(
                new Comment(UUID.randomUUID(), author, article, body, createdAt, createdAt));
    }

    public Comment build(
            UUID id,
            User author,
            Article article,
            String body,
            LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        return modelValidator.validate(new Comment(id, author, article, body, createdAt, updatedAt));
    }

}
