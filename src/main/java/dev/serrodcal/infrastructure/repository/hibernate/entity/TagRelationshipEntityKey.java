package dev.serrodcal.infrastructure.repository.hibernate.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

@Embeddable
public class TagRelationshipEntityKey {

    @ManyToOne
    public ArticleEntity article;

    @ManyToOne
    public TagEntity tag;

}
