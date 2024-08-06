package dev.serrodcal.infrastructure.repository.hibernate.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "TAGS")
@Cacheable
public class TagEntity extends PanacheEntityBase {

    @Id
    public UUID id;

    public String name;

    @OneToMany(mappedBy = "tag", fetch = FetchType.LAZY)
    public List<TagRelationshipEntity> articlesTags;

}
