package dev.serrodcal.infrastructure.repository.hibernate.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity(name = "ARTICLES")
@Cacheable
public class ArticleEntity extends PanacheEntityBase {

    @Id
    public UUID id;

    public String slug;
    public String title;
    public String description;
    public String body;

    @CreationTimestamp
    public LocalDateTime createdAt;
    @UpdateTimestamp
    public LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false)
    public UserEntity author;

    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<CommentEntity> comments;

    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<TagRelationshipEntity> tags;

    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<FavoriteRelationshipEntity> favorites;

}
