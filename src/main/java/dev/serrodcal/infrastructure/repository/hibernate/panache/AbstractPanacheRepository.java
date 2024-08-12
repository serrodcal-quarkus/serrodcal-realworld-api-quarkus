package dev.serrodcal.infrastructure.repository.hibernate.panache;

import dev.serrodcal.domain.model.article.FavoriteRelationship;
import dev.serrodcal.infrastructure.repository.hibernate.entity.*;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class AbstractPanacheRepository<ENTITY, ID> implements PanacheRepositoryBase<ENTITY, ID> {

    protected UserEntity findUserEntityById(UUID id) {
        return getEntityManager().find(UserEntity.class, id);
    }

    protected TagEntity findTagEntityById(UUID id) {
        return getEntityManager().find(TagEntity.class, id);
    }

    protected ArticleEntity findArticleEntityById(UUID id) {
        return getEntityManager().find(ArticleEntity.class, id);
    }

    protected CommentEntity findCommentEntityById(UUID id) {
        return getEntityManager().find(CommentEntity.class, id);
    }

    protected FavoriteRelationshipEntity findFavoriteRelationshipEntityByKey(
            FavoriteRelationship favoriteRelationship) {

        final var userEntity = findUserEntityById(favoriteRelationship.user().id());
        final var articleEntity = findArticleEntityById(favoriteRelationship.article().id());

        final var favoriteRelationshipEntityKey = new FavoriteRelationshipEntityKey();
        favoriteRelationshipEntityKey.user = userEntity;
        favoriteRelationshipEntityKey.article = articleEntity;

        return getEntityManager().find(FavoriteRelationshipEntity.class, favoriteRelationshipEntityKey);
    }

    protected boolean isNotEmpty(List<?> list) {
        return list != null && !list.isEmpty();
    }

    protected List<String> toUpperCase(List<String> subjectList) {
        return subjectList.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

}
