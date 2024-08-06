package dev.serrodcal.infrastructure.repository.hibernate.entity;

import jakarta.persistence.*;

@Entity(name = "FOLLOW_RELATIONSHIP")
@Cacheable
public class FollowRelationshipEntity {

    @EmbeddedId
    public FollowRelationshipEntityKey primaryKey;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    public UserEntity user;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    public UserEntity followed;

}
