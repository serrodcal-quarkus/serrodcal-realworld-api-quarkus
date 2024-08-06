package dev.serrodcal.infrastructure.repository.hibernate.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class FavouriteRelationshipEntityKey implements Serializable {

    @ManyToOne
    public ArticleEntity article;

    @ManyToOne
    public UserEntity user;

}
