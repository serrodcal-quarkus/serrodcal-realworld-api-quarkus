package dev.serrodcal.infrastructure.repository.hibernate.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

@Embeddable
public class FollowRelationshipEntityKey {

    @ManyToOne
    public UserEntity user;

    @ManyToOne
    public UserEntity followed;

}
