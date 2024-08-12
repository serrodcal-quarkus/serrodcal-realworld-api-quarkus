package dev.serrodcal.infrastructure.repository.hibernate.entity;

import dev.serrodcal.domain.model.article.ArticleModelBuilder;
import dev.serrodcal.domain.model.comment.CommentBuilder;
import dev.serrodcal.domain.model.tag.TagBuilder;
import dev.serrodcal.domain.model.user.UserModelBuilder;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EntityUtils {

    private final UserModelBuilder userBuilder;
    private final TagBuilder tagBuilder;
    private final ArticleModelBuilder articleBuilder;
    private final CommentBuilder commentBuilder;

    public EntityUtils(UserModelBuilder userBuilder, TagBuilder tagBuilder, ArticleModelBuilder articleBuilder, CommentBuilder commentBuilder) {
        this.userBuilder = userBuilder;
        this.tagBuilder = tagBuilder;
        this.articleBuilder = articleBuilder;
        this.commentBuilder = commentBuilder;
    }
}
