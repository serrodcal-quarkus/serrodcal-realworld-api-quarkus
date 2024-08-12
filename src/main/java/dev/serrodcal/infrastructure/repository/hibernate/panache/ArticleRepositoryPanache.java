package dev.serrodcal.infrastructure.repository.hibernate.panache;

import dev.serrodcal.domain.model.article.Article;
import dev.serrodcal.domain.model.article.ArticleFilter;
import dev.serrodcal.domain.model.article.ArticleRepository;
import dev.serrodcal.domain.model.article.PageResult;
import dev.serrodcal.infrastructure.repository.hibernate.entity.ArticleEntity;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class ArticleRepositoryPanache extends AbstractPanacheRepository<ArticleEntity, UUID> implements ArticleRepository {

    @Override
    public boolean existsBySlug(String slug) {
        return false;
    }

    @Override
    public void save(Article article) {

    }

    @Override
    public Optional<Article> findArticleById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<Article> findBySlug(String slug) {
        return Optional.empty();
    }

    @Override
    public void update(Article article) {

    }

    @Override
    public Optional<Article> findByAuthorAndSlug(UUID authorId, String slug) {
        return Optional.empty();
    }

    @Override
    public void delete(Article article) {

    }

    @Override
    public PageResult<Article> findMostRecentArticlesByFilter(ArticleFilter articleFilter) {
        return null;
    }

    @Override
    public PageResult<Article> findArticlesByFilter(ArticleFilter filter) {
        return null;
    }

    @Override
    public long count(List<String> tags, List<String> authors, List<String> favorited) {
        return 0;
    }
}
