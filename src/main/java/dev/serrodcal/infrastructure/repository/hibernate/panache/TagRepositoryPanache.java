package dev.serrodcal.infrastructure.repository.hibernate.panache;

import dev.serrodcal.domain.model.tag.Tag;
import dev.serrodcal.domain.model.tag.TagRepository;
import dev.serrodcal.infrastructure.repository.hibernate.entity.TagEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class TagRepositoryPanache extends AbstractPanacheRepository<TagEntity, UUID> implements TagRepository {

    @Override
    public List<Tag> findAllTags() {
        return List.of();
    }

    @Override
    public Optional<Tag> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public void save(Tag tag) {

    }

    @Override
    public List<Tag> findByNames(List<String> names) {
        return List.of();
    }

}
