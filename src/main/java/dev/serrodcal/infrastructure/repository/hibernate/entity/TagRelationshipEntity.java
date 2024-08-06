package dev.serrodcal.infrastructure.repository.hibernate.entity;

import jakarta.persistence.*;

@Entity(name = "TAG_RELATIONSHIP")
@Cacheable
public class TagRelationshipEntity {

    @EmbeddedId
    public TagRelationshipEntityKey primaryKey;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    public ArticleEntity article;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    public TagEntity tag;

}
