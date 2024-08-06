package dev.serrodcal.infrastructure.repository.hibernate.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity(name = "FAVORITE_RELATIONSHIP")
@Cacheable
public class FavouriteRelationshipEntity extends PanacheEntityBase {

    @EmbeddedId
    public FavouriteRelationshipEntityKey primaryKey;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    public ArticleEntity article;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    public UserEntity user;

}
