package dev.serrodcal.infrastructure.repository.hibernate.panache;

import dev.serrodcal.domain.model.user.User;
import dev.serrodcal.domain.model.user.UserRepository;
import dev.serrodcal.infrastructure.repository.hibernate.entity.EntityUtils;
import dev.serrodcal.infrastructure.repository.hibernate.entity.UserEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class UserRepositoryPanache extends AbstractPanacheRepository<UserEntity, UUID> implements UserRepository {

    @Inject
    EntityUtils entityUtils;

    @Override
    public void save(User user) {

    }

    @Override
    public boolean existsBy(String field, String value) {
        return false;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public boolean existsUsername(UUID excludeId, String username) {
        return false;
    }

    @Override
    public boolean existsEmail(UUID excludeId, String email) {
        return false;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }

}
