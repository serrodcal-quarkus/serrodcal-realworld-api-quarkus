package dev.serrodcal.infrastructure.repository.hibernate.panache;

import dev.serrodcal.domain.model.article.Article;
import dev.serrodcal.domain.model.comment.Comment;
import dev.serrodcal.domain.model.comment.CommentRepository;
import dev.serrodcal.infrastructure.repository.hibernate.entity.CommentEntity;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class CommentRepositoryPanache extends AbstractPanacheRepository<CommentEntity, UUID> implements CommentRepository {

    @Override
    public void save(Comment comment) {

    }

    @Override
    public Optional<Comment> findByIdAndAuthor(UUID commentId, UUID authorId) {
        return Optional.empty();
    }

    @Override
    public void delete(Comment comment) {

    }

    @Override
    public List<Comment> findCommentsByArticle(Article article) {
        return List.of();
    }
}
