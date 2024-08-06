package dev.serrodcal.infrastructure.repository.hibernate.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity(name = "USERS")
@Cacheable
public class UserEntity extends PanacheEntityBase {

    @Id
    public UUID id;

    public String username;
    public String bio;
    public String image;
    public String salt;
    public String hash;
    public String email;

    @CreationTimestamp
    public LocalDateTime createdAt;
    @UpdateTimestamp
    public LocalDateTime updatedAt;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    List<ArticleEntity> articles;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    public List<FollowRelationshipEntity> following;

    @OneToMany(mappedBy = "followed", fetch = FetchType.LAZY)
    public List<FollowRelationshipEntity> followedBy;

}
